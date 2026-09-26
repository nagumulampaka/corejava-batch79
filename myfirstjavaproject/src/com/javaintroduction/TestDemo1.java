package com.javaintroduction;

public class TestDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("Main Method Started");

		// Fully Qualified of the Classes = package name + class name
		// The Below Two Classes are loading with the help of Bootstrap class loader.
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));

		// The Below Class is loading with the help of Application Class Loader.
		System.out.println(Class.forName("com.javaintroduction.Welcome"));
		
		// com.mysql.cj.jdbc.Driver
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		
		System.out.println("Main Method Ended.");
	}

}
