package model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	private int todoId ;
	private String todoTitle;
	@Column(length = 1500)
	private String todoContent ;
	private Date todoDate;
	public Todo() {}
	public Todo( String todoTitle, String todoContent, Date todoDate) {
		super();
		this.todoId = new Random().nextInt(100000);
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.todoDate = todoDate;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodoDate() {
		return todoDate;
	}
	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

}
