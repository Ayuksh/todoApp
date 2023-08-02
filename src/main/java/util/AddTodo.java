package util;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import model.Todo;

@WebServlet("/addTodo")
public class AddTodo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddTodo() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String todoTitle = request.getParameter("title");
		String tododContent = request.getParameter("content");
		Todo todo = new Todo( todoTitle, tododContent, new Date());
		Session ses = FactoryProvider.getFactory().openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(todo);
		tx.commit();
		response.setContentType("text/html");
		pw.write("<h1 style='text-aling:center;'>RECORD INSERTED </h1>");
		pw.write("<h1 style='text-aling:center;'><a href='showTodo.jsp'>click here to view all todo</a></h1>");
		
	}

}
