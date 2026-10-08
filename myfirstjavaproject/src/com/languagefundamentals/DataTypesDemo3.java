package com.languagefundamentals;

// Wrapper Caching
// == Operator Checks the References of the objects but not in values.
// == Operators checks the values if it is primitive data types.
public class DataTypesDemo3 {

	public static void main(String[] args) {
		
		int i3 = 10;
		int i4 = 10;
		System.out.println(i3 == i4);
		
		// The Range for wrapper caching is -128 to 127
		// if the range is within -128 to 127 
		// all the values are sharing same object Reference.
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);
		
		// if the range is crossed then for every element, it's creating new Object
		// so the below values are not same based on the addresses of the object.
		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);
	}

}
