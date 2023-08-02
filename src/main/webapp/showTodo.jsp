<%@page import="model.Todo"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="cssLink.jsp"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%@include file="navBar.jsp"%>
		<br>
		<h1>ALL TODO'S</h1>
		<br>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<%
				Session ses = FactoryProvider.getFactory().openSession();
				Query q = ses.createQuery("from Todo");
				List<Todo> list = q.list();
				for (Todo t : list) {
				%>
				<div class="card m-3">
					<img class="card-img-top m-4"
						style="width: 100px; align-self: left;" src="img/notebook.png"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title"><%=t.getTodoTitle()%></h5>
						<p class="card-text"><%=t.getTodoContent()%></p>
						<h6 class="card-title"><%=t.getTodoDate()%></h6>
						<a href="deleteTodo?todo_id=<%=t.getTodoId() %>" style="text-aling: center;" class="btn btn-danger">Delete</a>
						<a href="#" style="text-aling: center;" class="btn btn-primary">Edit</a>

					</div>
				</div>
				<%
				}
				%>

			</div>
		</div>
	</div>

</body>
</html>