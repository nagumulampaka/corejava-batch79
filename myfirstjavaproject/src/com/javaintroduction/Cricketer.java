package com.javaintroduction;

/**
 * Write a program to print Indian Cricket Information JVM providing default values, 
 * when we are not assigning any values for class level data. Whether it is a static or instance. 
 * for numeric values JVM will give default value as 0.
 * for any Object values JVM will give default values as null. 
 * 
 * Any Java program, if there is no constructor then 
 * java compiler will create a default constructor which we cannot see.
 * 
 * Q) What is the Difference between static variable & instance variable when we use what ...?
 * whenever the data is same for all the objects then go and make sure the data as static.
 * whenever the data is changing from object to object then go and make sure that as instance.
 * 
 * All static related data is storing it into --> Method Area --> whenever the class is loaded.
 * All instance related data is storing into --> Heap Area. --> whenever object is created.
 * 
 * For every object, JVM create a new copy with default data whereas for static data it's using same copy for all objects
*/

public class Cricketer {
	
	// Step 1: Declaration
	// static variables
	static int countryID;
    static String countryName;
    
    // instance variable or non-static variables
    int jerseyNumber;
    String cricketerName;
    
	public static void main(String[] args) {
       System.out.println("Welcome to Indian Cricket Team");
       
       // Step 2: Initialization
       countryID = 91;
       countryName = "India";
       
       // Step 3: Accessing or Representing the static data
       System.out.println("Country ID: " + countryID); // 0 (Default Value) --> 91
       System.out.println("Country Name: " + countryName); // null (Default Value) --> India
       
       // Step 4: Accessing instance data in static area is not possible directly.
       // Cannot make a static reference to the non-static field jerseyNumber
       // System.out.println(jerseyNumber); // 0
       // Cannot make a static reference to the non-static field cricketerName
       // System.out.println(cricketerName); // null
       
       // can we access instance data in static area ..? 
       // No Directly but we can create object to access instance data in static area.
       
       // LSH : ClassnName + Object Reference variable 
       // RHS : new is a create object in java with constructor Calling.
       // so total RHS  will consider as a object and which we are storing it into 
       // LHS will consider as object reference variable of a class.
       
       // Object Creation
       Cricketer ruturaj = new Cricketer();
       ruturaj.jerseyNumber = 31;
       ruturaj.cricketerName = "Ruturaj Gaikwad";
       System.out.println("Jersey Number: " + ruturaj.jerseyNumber); // 0 (default value) --> 31
       System.out.println("Name of the Cricketer: " + ruturaj.cricketerName); // null (default value) --> Ruturaj Gaikwad
       System.out.println("-----------------------------------------------");
       
       Cricketer sanju = new Cricketer();
       sanju.jerseyNumber = 11;
       sanju.cricketerName = "Sanju Samson";
       System.out.println("Country ID: " + countryID);
       System.out.println("Country Name: " + countryName);
       System.out.println("Jersey Number: " + sanju.jerseyNumber);
       System.out.println("Name of the Cricketer: " + sanju.cricketerName);
       System.out.println("-----------------------------------------------");
       
       Cricketer dhoni = new Cricketer();
       dhoni.jerseyNumber = 7;
       dhoni.cricketerName = "Mahendra Singh Dhoni";
       System.out.println("Country ID: " + countryID);
       System.out.println("Country Name: " + countryName);
       System.out.println("Jersey Number: " + dhoni.jerseyNumber);
       System.out.println("Name of the Cricketer: " + dhoni.cricketerName);
       System.out.println("-----------------------------------------------"); 
       
       Cricketer dube = new Cricketer();
       countryID = 92;
       countryName = "Bharat";
       dube.jerseyNumber = 25;
       dube.cricketerName = "Shivam Dube";
       System.out.println("Country ID: " + countryID);
       System.out.println("Country Name: " + countryName);
       System.out.println("Jersey Number: " + dube.jerseyNumber);
       System.out.println("Name of the Cricketer: " + dube.cricketerName);
       System.out.println("-----------------------------------------------"); 
       
       Cricketer ayush = new Cricketer();
       ayush.jerseyNumber = 56;
       ayush.cricketerName = "Ayush Mhatre";
       System.out.println("Country ID: " + countryID); // 92
       System.out.println("Country Name: " + countryName); // Bharath
       System.out.println("Jersey Number: " + ayush.jerseyNumber);
       System.out.println("Name of the Cricketer: " + ayush.cricketerName);
       System.out.println("-----------------------------------------------"); 
	}

}
