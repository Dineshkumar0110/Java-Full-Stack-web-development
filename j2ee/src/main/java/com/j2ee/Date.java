package com.j2ee;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {
	
	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfYear());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.NOON.getHour());
		
	}

}
