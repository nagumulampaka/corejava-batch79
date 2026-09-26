package com.javaintroduction;

// static block vs instance block
public class TestDemo6 {

	// instance variable
	// static variable
	static TestDemo6 t = new TestDemo6();
	static TestDemo6 t1 = new TestDemo6();

	static {
		System.out.println("static block is loaded");
	}

	// instance block
	// when you create object the instance block is loaded automatically
	{
		System.out.println("instance block loaded");
		// error : StackOverFlowError
		// TestDemo6 t = new TestDemo6();
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		// Object Creation
		// TestDemo6 t = new TestDemo6();
		System.out.println("Main Method Ended");
	}

	// static block loaded
	// static {
	// // TestDemo6 t = new TestDemo6();
	// System.out.println("static block loaded");
	// // TestDemo6 t = new TestDemo6();
	// }

}
