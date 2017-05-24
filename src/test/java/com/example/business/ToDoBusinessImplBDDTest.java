package com.example.business;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.service.TodoService;

public class ToDoBusinessImplBDDTest {

//	@Test
//	public void testReturnToDosRelatedToSpring() {
//		
//		String[] expecteds = {"Learn Spring", "Practice Spring Examples", "Learn Spring MVC"};	
//		
//		// 1st step is setup 
//
//		TodoService todoServiceMock = mock(TodoService.class);
//		List<String> todos = Arrays.asList("Learn Spring", "Practice Spring Examples", "Learn Spring MVC");
//		given(todoServiceMock.returnTodos("Dummy")).willReturn(todos);
//		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
//		
//		// 2nd step is when where we invoke the SUT
//		List<String> returnToDosRelatedToSpring = todoBusinessImpl.returnToDosRelatedToSpring("Dummy");
//		
//		// 3rd step is asserts and then statement
//		assertThat(returnToDosRelatedToSpring.toArray(), is(expecteds));
//	}
	
//	@Test
//	public void testDeleteToDosNotRelatedToSpring(){
//		// setup
//		TodoService mockToDo = mock(TodoService.class);
//		List<String> todos = Arrays.asList("Learn Spring", "Practice Spring Examples", "Learn Dance", "Learn Cooking", "Learn Spring MVC");
//		given(mockToDo.returnTodos("Dummy")).willReturn(todos);
//		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(mockToDo);
//		
//		// when
//		todoBusinessImpl.deleteToDosNotRelatedToSpring("Dummy");
//		
//		// then
//		verify(mockToDo, times(1)).deleteTodo("Learn Dance");
//		verify(mockToDo, never()).deleteTodo("Learn Spring");
//		verify(mockToDo, never()).deleteTodo("Practice Spring Examples");
//	}
//	
//	@Test
//	public void testAddToDoToUserAccount(){
//		// setup
//		TodoService mockAdd = mock(TodoService.class);
//		ToDoBusinessImpl todoImpl = new ToDoBusinessImpl(mockAdd);
//		List<String> todos = new ArrayList<>(Arrays.asList("New Added ToDo1"));
//		given(mockAdd.addToDo("Dummy", "New Added ToDo1")).willReturn(todos);
//		
//		
//		// when
//		
//		 List<String> addedTodo = todoImpl.addToDoToUserAccount("Dummy", "New Added ToDo1");
//		 
////		 Assert.assertArrayEquals(todos.toArray(), addedTodo.toArray());
//		
//		// then
//		 verify(mockAdd).addToDo("Dummy", "New Added ToDo1");
//	}
//	
	@Test
	public void testUpdateToDo(){
		// setup
		TodoService todoService = mock(TodoService.class);
		ToDoBusinessImpl todoImpl = new ToDoBusinessImpl(todoService);
		List<String> oldtodos = new ArrayList<>(Arrays.asList("New Added ToDo1"));
		List<String> todos = new ArrayList<>(Arrays.asList("New Added ToDo1 Changed"));
		given(todoService.returnTodos("Dummy")).willReturn(oldtodos);
		given(todoService.updateTodo("Dummy", "New Added ToDo1", "New Added ToDo1 Changed")).willReturn(todos);
		
		// when
		todoImpl.updateToDoForUser("Dummy", "New Added ToDo1", "New Added ToDo1 Changed");
		
		// then
		verify(todoService).updateTodo("Dummy", "New Added ToDo1", "New Added ToDo1 Changed");
	}
}












