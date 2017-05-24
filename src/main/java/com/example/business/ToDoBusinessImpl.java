package com.example.business;

import java.util.ArrayList;
import java.util.List;

import com.example.service.TodoService;

// ToDoBusinessImpl is System under Test SUT

public class ToDoBusinessImpl {
	
	//dependency
	private TodoService todoService;

	public ToDoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> returnToDosRelatedToSpring(String user){
		List<String> filteredToDos = new ArrayList<String>();
		List<String> returnTodos = todoService.returnTodos(user);
		for(String todo : returnTodos){
			if(todo.contains("Spring")){
				filteredToDos.add(todo);
			}
		}
		return filteredToDos;
	}
	
	public void deleteToDosNotRelatedToSpring(String user){
		List<String> todos = todoService.returnTodos(user);
		for(String todo : todos){
			if(!todo.contains("Spring")){
				todoService.deleteTodo(todo);
			}
		}
	}
	
	public List<String> addToDoToUserAccount(String user, String todo){
		List<String> todos = todoService.addToDo(user, todo);
		return todos;
	}
	
	public List<String> updateToDoForUser(String user, String oldtodo, String newtodo){
		List<String> todos = todoService.returnTodos(user);
		for(String todo : todos){
			if(todo.contains(oldtodo)){
				todoService.updateTodo(user, oldtodo, newtodo);
			}
		}
		return todos;
	}
}
