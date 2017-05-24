package com.example.service;

import java.util.List;

public interface TodoService {
	public List<String> returnTodos(String user);
	public void deleteTodo(String todo);
	public List<String> addToDo(String user, String todo);
	public List<String> updateTodo(String user, String oldtodo, String newtodo);
}
