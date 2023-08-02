package util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import model.Todo;

@WebServlet("/deleteTodo")
public class DeleteTodo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("todo_id");
		System.out.println(id);
		int todo_id = Integer.parseInt(id.trim());
		Session ses = FactoryProvider.getFactory().openSession();
		Transaction tx = ses.beginTransaction();
		Todo t = ses.get(Todo.class, todo_id);
		
		ses.delete(t);
		tx.commit();
		
		resp.sendRedirect("showTodo.jsp");
	}
}
