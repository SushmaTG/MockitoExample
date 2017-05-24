package com.example.business;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.service.TodoService;

public class ToDoBusinessImplMockTest {

	@Test
	public void test() {
		
		String[] expecteds = {"Learn Spring", "Practice Spring Examples", "Learn Spring MVC"};	
		
		// Mock is used to dynamically create a stubs for the services and also provide additional 
		// features compared to stub method of testing the services

		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring", "Practice Spring Examples", "Learn Spring MVC");
//		the when and then statements are used to set the expected values upon mocking the service class
		when(todoServiceMock.returnTodos("Dummy")).thenReturn(todos);
//		the above statement now returns the values we want from the returnToDos method when called
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
		List<String> returnToDosRelatedToSpring = todoBusinessImpl.returnToDosRelatedToSpring("Dummy");
		assertArrayEquals(expecteds, returnToDosRelatedToSpring.toArray());
	}
	
	@Test
	public void test_withEmptyArray() {
		
		String[] expecteds = {};	
		
		// Mock is used to dynamically create a stubs for the services and also provide additional 
		// features compared to stub method of testing the services

		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
//		the when and then statements are used to set the expected values upon mocking the service class
		when(todoServiceMock.returnTodos("Dummy")).thenReturn(todos);
//		the above statement now returns the values we want from the returnToDos method when called
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceMock);
		List<String> returnToDosRelatedToSpring = todoBusinessImpl.returnToDosRelatedToSpring("Dummy");
		assertArrayEquals(expecteds, returnToDosRelatedToSpring.toArray());
	}

}
