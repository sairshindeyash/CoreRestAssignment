package com.yash.assignment;

import java.time.LocalDate;

public class AddingDate {

	public LocalDate addDays(int i) {
		
		
		return LocalDate.now().plusDays(i);
	}
 public static void main(String[] args) {
	AddingDate addingDate=new AddingDate();
	System.out.println(addingDate.addDays(5));
}
}
