package com.example.service;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements TodoService {

	@Override
	public List<String> returnTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring", "Practice Spring Examples", "Learn Spring MVC", 
				"Learn Dance", "Learn Cooking");
	}

	@Override
	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> addToDo(String user, String todo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> updateTodo(String user, String oldtodo, String todo) {
		// TODO Auto-generated method stub
		return null;
	}
}
