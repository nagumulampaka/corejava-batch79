
package com.languagefundamentals;

class Employee {
	int eid = 101;
	String ename = "nagu";
	double salary = 78000;
	int age = 26;
	Address address = new Address();
}

class Address {
	String flat = "LIG-123";
	String plot = "LIG";
	String street = "Peda Waltair";
	String city = "Visakhapatnam";
	String state = "Abdhra Pradesh";
	int pincode = 530017;
}

public class DataTypesDemo4 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.salary);
		System.out.println(emp.age);
		
		// it prints address of the object
		System.out.println(emp.address);
		
		System.out.println(emp.address.flat);
		System.out.println(emp.address.plot);
		System.out.println(emp.address.street);
		System.out.println(emp.address.city);
		System.out.println(emp.address.state);
		System.out.println(emp.address.pincode);
	}

}
