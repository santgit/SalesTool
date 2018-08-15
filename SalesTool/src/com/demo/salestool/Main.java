package com.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}

	
	private static void displayGreeting() {
		System.out.println("HELLO");
		System.out.println("SECOND HELLO");
	}
}
