package com.javaintroduction;

public class TestDemo3 {
	
	// static we can use in class level not in block level
	static String collageName = "VCUBE Software Solutions";
	public static void main(String[] args) {
		
		// local variable: inside a method
		// Illegal modifier for parameter collageName; only final is permitted
        String collageName = "Dr Lankapalli Bullayya PG Collage";
        System.out.println(collageName);
        System.out.println(TestDemo3.collageName);
        System.out.println(Employee.org_name);
        
        // Illegal modifier for parameter collageName; only final is permitted
        // static int number = 10;
        
        // The local variable x may not have been initialized
        // JVM Will not provided the default values for local variables.
        int x;
        x = 20;
        System.out.println(x);
	}
}
