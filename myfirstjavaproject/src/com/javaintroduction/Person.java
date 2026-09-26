package com.javaintroduction;

public class Person {
	
	// Called by the garbage collector on an object 
	// when garbage collection determines that there are no more references to the object. 
	// A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
 	}
	
	void hello() {
		System.out.println("Hello, Everyone Welcome to Java World!");
		// 4. Out of Scope : Object inside the method
		Person person = new Person();
		System.out.println("Hello Method ended");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Strted !!");
		
		Person person1 = new Person();
		// com.javaintroduction.Person@1dbd16a6
		System.out.println(person1);
		
		Person person2 = new Person();
		// com.javaintroduction.Person@7ad041f3
		System.out.println(person2);
		
		Person person3 = new Person();
		// com.javaintroduction.Person@251a69d7
		System.out.println(person3);
		
		// 1. Nullifying the Object
		person1 = null;
		
		// 2. re-assign the value
		person2 = person3;
		
		// 3. Anonymous Object
		new Person().hello();
		
		// Runs the garbage collector in the Java Virtual Machine.
		System.gc();
		
		System.out.println(person1); // null
		System.out.println(person2); // com.javaintroduction.Person@251a69d7
		System.out.println(person3); // com.javaintroduction.Person@251a69d7
		
		// Returns a hash code value for this object. 
		// This method is supported for the benefit of hash tables such as those provided by java.util.HashMap.
		// hashCode : 498931366
		// System.out.println(person1.hashCode());
		
		// output : 498931366
		// int a = 0x1dbd16a6;
		// System.out.println(a);
	}

}
