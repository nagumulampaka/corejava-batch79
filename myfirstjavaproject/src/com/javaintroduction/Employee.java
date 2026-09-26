package com.javaintroduction;

public class Employee {
	
	// static variables
	static int org_id = 555;
	static String org_name = "VCUBE Software Solutions";
	
	// instance variables
	int employeeID = 101;
	String employeeName = "Unknown";
	
	public static void main(String[] args) {
        System.out.println("Main Method Started");
        
        // static variables, we can access directly !!
        System.out.println("Accessing the static data directly !!");
        System.out.println(org_id);
        System.out.println(org_name);
        
        System.out.println("Accessing the static data by using class name");
        System.out.println(Employee.org_id);
        System.out.println(Employee.org_name);
        
        System.out.println("Accessing the static data by using onject reference variable");
        Employee employee = new Employee();
        // The static field Employee.org_name should be accessed in a static way
        System.out.println(employee.org_id);
        System.out.println(employee.org_name);
        
        Employee employee1 = null;
        // There is no impact with static data, so that is the reason, 
        // we should access static data with class names only
        System.out.println(employee1.org_id);
        System.out.println(employee1.org_name);
        
        // NullPointerException (NPE) --> null dot anything or any operation is NPE
        System.out.println(employee1.employeeID); 
        
        System.out.println("Accessing the instance data by using Object regerence variable");
        employee.employeeID = 42;
        employee.employeeName = "Nagu Mulampaka";
        System.out.println(employee.employeeID);
        System.out.println(employee.employeeName);
        
        System.out.println("Main Method Ended");
	}

}
