package com.example.business;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListClassMockTest {

	@Test
	public void testListClassSize() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2);
		assertEquals(2, mockList.size());
	}
	
	@Test(expected=RuntimeException.class)
	public void testListGet(){
		List mockList = mock(List.class);
		when(mockList.get(anyInt())).thenThrow(new RuntimeException());
		mockList.get(2);
		mockList.get(3);
	}

}
