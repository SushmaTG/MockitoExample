package com.example.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.service.ToDoServiceStub;

public class ToDoBusinessImplStubTest {

	String[] expecteds = {"Learn Spring", "Practice Spring Examples", "Learn Spring MVC"};	

	@Test
	public void test() {
		ToDoServiceStub todoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceStub);
		List<String> returnToDosRelatedToSpring = todoBusinessImpl.returnToDosRelatedToSpring("Dummy");
		assertArrayEquals(expecteds, returnToDosRelatedToSpring.toArray());
	}

}
