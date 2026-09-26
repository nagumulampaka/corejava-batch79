package com.javaintroduction;

public class TestDemo5 {
	
	static TestDemo5 test = new TestDemo5();
	
	// in static methods, can we call static methods directly... ? Yes 
	static void method1() {
		method2();
		System.out.println("method 1 is called !!");
	}
	
	// in instance method, can we call instance methods directly.. ? Yes
	void method3() {
		method4();
		System.out.println("method 3 is called !!");
	}
	
	// in instance, can we call static methods directly ..? Yes
	void method4() {
		System.out.println("method 4 is called !!");
		method5();
	}
	
	static void method5() {
		System.out.println("method 5 is called !!");
	}
	
	// in static method, can we call instance methods directly..? No
	// if we want to create we must need to create object..
	static void method2() {
		test.method3();
		System.out.println("method 2 is called !!");
	}

	public static void main(String[] args) {
        System.out.println("Main Method Started");
        TestDemo5.method1();
        System.out.println("Main Method ended");
	}

}
