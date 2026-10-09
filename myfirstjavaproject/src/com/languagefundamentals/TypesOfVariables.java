package com.languagefundamentals;

// in Java, variables are divided into  total 3 types with 2 Divisions.
// Division 1: Based on the value
//             -- Primitive or Object
// Division 2: Based on the Position
//             -- static or instance or local

// whenever the data is same all the object then go and make sure the data should be static (method area)
// whenever the data is different from object to object then keep those data as instance. (heap area)
// for maintaining temporary values we use local variables.(stack area)
// but local variables must need to be initialized to access.
// except final no other modifier will not acceptable for local variables.

public class TypesOfVariables {
	
	static String orgName = "Vcube"; // static + object
	static int orgId = 555; // static + primitive
	
	int id = 123; // instance + primitive
	String name = "nagu";  // instance + object

	public static void main(String[] args) {
		
		String orgName = "VSS"; // local + object type
		int orgId = 666; // local + primitive
		
		TypesOfVariables t = new TypesOfVariables();
		
		System.out.println("local values can access directly");
        System.out.println(orgName);
        System.out.println(orgId);
         
        System.out.println("static values can access by using class name also");
        System.out.println(TypesOfVariables.orgName);
        System.out.println(TypesOfVariables.orgId);
        
        // The static field TypesOfVariables.orgName should be accessed in a static way
        // The static field TypesOfVariables.orgId should be accessed in a static way
        System.out.println("static values can access by using by using object reference variables also but not recommended");
        System.out.println(t.orgName);
        System.out.println(t.orgId);
        
        TypesOfVariables t2 = null;
        System.out.println("static values can access by using by using object reference variables also but not recommended");
        System.out.println(t2.orgName);
        System.out.println(t2.orgId);
        
        // System.out.println(t2.id); // NPE
        System.out.println("main method ended");
	}

}
