<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="cssLink.jsp"%>
<title>Add TODO'S</title>
</head>
<body>
	<div class="container">
		<%@include file="navBar.jsp"%>
	</div>
	<br>
	<br>
	<div class="container">
	<h1>Add new To - Do here </h1>
		<form action="addTodo" method="post">
			<div class="form-group">
				<label for="todoTitle">To-Do Title</label> <input name="title" required type="text"
					class="form-control" id="title" placeholder="Enter Title here ">
			</div>
			<div class="form-group">
				<label for="todoContent">Today's To-do</label>
				<textarea name="content" required="required" style="height: 300px" class="form-control" id="content" placeholder="Enter todo here "></textarea>
			</div>

			<div class="container text-center"> 
			<button type="submit" class="btn btn-primary ">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>