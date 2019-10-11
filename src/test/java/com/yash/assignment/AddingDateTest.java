package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class AddingDateTest {
	AddingDate addingDate=new AddingDate();
	@Test
	public void shouldReturnDate14AfterAdding5ToCurrentDate() {
		LocalDate localDate=LocalDate.now().plusDays(5);
		assertEquals(localDate, addingDate.addDays(5));
	}
	
	
}
