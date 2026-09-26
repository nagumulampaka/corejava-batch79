package com.javaintroduction;

public class Customer {
	 
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
 	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Customer customer1 = new Customer(); 
		// Output : com.javaintroduction.Customer@1dbd16a6
		System.out.println(customer1);	// Address of the Object
		
		Customer customer2 = new Customer();
		// Output : com.javaintroduction.Customer@7ad041f3
		System.out.println(customer2);
		
		customer1 = null;
		// Runs the Garbage Collector.
		System.gc();
		
		System.out.println("Main Method Ended");
	}

}
