package com.languagefundamentals;

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		
		float f1 = 123; // int -> float
		float f2 = 0123; // octal -> int -> float
		float f3 = 0x123; // Hexa -> int -> float
    	// float f4 = 0123.5; // Type mismatch: cannot convert from double to float
		float f5 = 0123.5F; // valid but it is not octal it is float only
		// float f6 = 0x123.5F; // Invalid hex literal number
		float f7 = 0345F;
		float f8 = 0x345F;
		float f9 = 567F;
		float f10 = 123.9F;
		float f11 = 0456F;
		
		double d1 = 0123.5D;
		double d2 = 0x123D;
		
		System.out.println(f1); // 123.0
		System.out.println(f2); // 83.0
		System.out.println(f3); // 291.5
		System.out.println(f5); // 123.5
		System.out.println(f7); // 345.0
		System.out.println(f8); // 13407.0
		System.out.println(f9); // 567.0
		System.out.println(f10); // 123.9
		System.out.println(f11); // 456.0
		
		System.out.println(d1); // 123.5
		System.out.println(d2); // 4669.0

	}

}
