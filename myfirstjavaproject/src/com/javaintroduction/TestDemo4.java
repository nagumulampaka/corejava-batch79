package com.javaintroduction;

public class TestDemo4 {

	void hello() {
		System.out.println("Hello Guys, Good Morning Have a nice day !");
	}

	public static void main(String[] args) {
		TestDemo4 test = new TestDemo4();
		System.out.println("Main Method Started");
		// calling the methods
		test.hello();
		welcome();
		System.out.println("Main Method Ended");
	}

	public static void welcome() {
		System.out.println("welcome to java world!");
	}
}
