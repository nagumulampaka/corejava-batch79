package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

class Dog {
    String name = "Tommy";
}

public class ObjectDataTypesDemo {

	// pre-defined classes
	// in Java, Collection of Characters with double quotes 
	// storing into a single variable will consider String Literals.
	String s = "Nagu"; // String Literals
	String s1 = new String("nagumulampaka@gmail.com"); // String Object
	
	// Type mismatch: cannot convert from String to StringBuffer
	// StringBuffer sb = "Vcube";
	StringBuffer sb = new StringBuffer("Visakhapatnam");

	// Type mismatch: cannot convert from int to BigInteger
	// BigInteger bi = 100;
	BigInteger bi1 = new BigInteger("100");
	BigInteger bi2 = new BigInteger("400");
	
	// The constructor BigInteger() is undefined
	// BigInteger bi1 = new BigInteger();
	
	BigDecimal bd = new BigDecimal("78926326659654712354786474595471");

	// pre-defined Wrapper Objects
	Integer i = 100; // converting primitive data types to wrapper object is called auto-boxing
	Integer i1 = Integer.valueOf(100);
	
	int i2 = i; // converting wrapper object data types into primitive data types will consider as Auto-unboxing
	int i3 = i1.intValue();
	
	Boolean boo = true;
    Character c = 'M';
    
	// user-defined object data types
    Dog d = new Dog();

    // Object Data Types
	public static void main(String[] args) {
		System.out.println("main method started");
		ObjectDataTypesDemo objectDemo = new ObjectDataTypesDemo();

		System.out.println(objectDemo.s); // null (default)
		System.out.println(objectDemo.s1); // nagumulampaka@gmail.com
		
		System.out.println(objectDemo.sb); // null (default)

		System.out.println(objectDemo.bi1); // null (default)
		System.out.println(objectDemo.bi2);
		System.out.println(objectDemo.bi1.add(objectDemo.bi2)); // 500
		System.out.println(objectDemo.bi1.subtract(objectDemo.bi2)); // -300
		
		System.out.println(objectDemo.bd); // null (default)

		System.out.println(objectDemo.i); // null (default)
		System.out.println(objectDemo.i2);
		
		System.out.println(objectDemo.boo); // null (default)
		System.out.println(objectDemo.c); // null (default)
		
		System.out.println(objectDemo.d.name); // null (default)

		System.out.println("main method ended");
	}
}
