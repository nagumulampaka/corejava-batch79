package com.javaintroduction;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		hello();
		method1();
	}

	static void hello() {
		System.out.println("Hello, Good Morning Everyone !");
	}

	// Native methods do not specify a body
	// UnsatisfiedLinkError
	static native void method1();

}
