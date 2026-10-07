package com.languagefundamentals;

// byte -> short -> int -> long -> float -> double
public class TestDataTypesDemo1 {

	// byte = 1 byte = 8 bits = -128 to 127
	// By default RHS numeric values are int so int cannot convert into byte directly.
	// -128, -127, -126, -125, ....... 0, 1, 2, 3, 4, ...... 125, 126, 127
	byte b = 127;
	byte b1 = (byte) 128; // CE: Type mismatch: cannot convert from int to byte
	byte b2 = (byte) 130; // converting int to byte -> Explicit Type Casting
	byte b3 = (byte) 256;

	// short = 2 bytes = 16 bits = -32768 to 32767
	short s = 32767;
	short s1 = (short) 32768; // CE: Type mismatch: cannot convert from int to short -> int to short

	// int = 4 bytes = 32 bits = -2147483648 to 2147483647
	int i = 2147483647;
	// The literal 2147483648 of type int is out of range
	// int i1 = 2147483648;
	int i2 = (int) 2147483648L;

	long l = 2147483647; // int can convert directly into long --> Implicit Type Casting
	long l1 = i2; // Implicit Type Casting
	// The literal 9223372036854775808L of type long is out of range
	long l2 = 9223372036854775807L;

	float f = 5.5f;
	float f1 = 100; // int --> float : Implicit Type Casting
	float f2 = 55f;
	float f3 = 768.789789242246327f; // 5 to 6 decimal point data then go for float
	
	// by default decimal point data is double
	double d = 768.789789242246327D; // 10 to 15 Decimal point data then go for double
	double d1 = 78989865656897754548757487877D;

	// char = 2 bytes = 16 bits = - 32768 to 32767 = 0 to 65535
	char c = 'M';
	// 65 = A, 66 = B, 67 = C, 68 =  D, 69 = E, 70 = F, 71 = G, 72 = H, ... 90 = Z
	// 97 = a, 98 = b, 99 = c, ............................................ 122 = z.
	char c1 = 72; // ASCII Code Values : 0 to 127 values
	char c2 = 126;
	char c3 = 45679;
	char c4 =  '\u0040'; // unicode values hexa values
	
	int i3 = 'A'; // char can store into int : implicit type casting
	
	boolean boo = true;
	
	// TRUE cannot be resolved to a variable
	// boolean boo1 = TRUE;
	// boolean boo2 = FALSE;
	
	// True cannot be resolved to a variable
	// boolean boo3 = True;
	// boolean boo4 = False;
	
	// Type mismatch: cannot convert from int to boolean
	// boolean boo5 = 0;
	// boolean boo6 = 1;
	
	// Type mismatch: cannot convert from String to boolean
	// boolean boo7 = "true";
	// boolean boo8 = "false";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestDataTypesDemo1 t = new TestDataTypesDemo1();

		System.out.println("byte value: " + t.b); // 0 (default value)
		System.out.println("byte value: " + t.b1); // -128
		System.out.println("byte value: " + t.b2); // -126
		System.out.println("byte value: " + t.b3); // 0

		System.out.println("short value: " + t.s); // 0 (default value)
		System.out.println("short value: " + t.s1); // -32768

		System.out.println("int value: " + t.i); // 0 (default value)
		System.out.println("int value: " + t.i2); // -2147483648
		System.out.println("int value: " + t.i3); // 65
		
		System.out.println("long value: " + t.l); // 0 (default value)
		System.out.println("long value: " + t.l1); // -2147483648
		System.out.println("long value: " + t.l2); // 9223372036854775807

		System.out.println("float value: " + t.f); // 0.0 (default value)
		System.out.println("float value: " + t.f1); // 100.0
		System.out.println("float value: " + t.f2); // 55.0
		System.out.println("float value: " + t.f3); // 768.7898
		
		System.out.println("double value: " + t.d); // 0.0 (default value) // 768.7897892422463
		System.out.println("double value: " + t.d1); // 7.898986565689775E28
		
		System.out.println("char: " + t.c); // (empty space) (default value)
		System.out.println("char: " + t.c1); // H
		System.out.println("char: " + t.c2); // ~
		System.out.println("char: " + t.c3); // 뉯
		System.out.println("char: " + t.c4); // @
		
		System.out.println("boolean value: " + t.boo); // false (default value)
		if(t.boo) {
			System.out.println("Good Morning");
		}

		System.out.println("Main Method Ended");
	}

}
