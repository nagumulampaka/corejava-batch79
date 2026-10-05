package com.languagefundamentals;

public class Student {
	
	int roll_number;
	String $name;
	int age;
	
	public void _hello() {
		System.out.println("Good Morning Have a Nice Day!!");
	}

	public static void main(String[] args) {
       System.out.println("Main Method Started");
       
       Student student$ = new Student();
       System.out.println(student$.roll_number);
       System.out.println(student$.$name);
       System.out.println(student$.age);
       student$._hello();
       
       System.out.println("Main Method Ended");
	}

	
}
