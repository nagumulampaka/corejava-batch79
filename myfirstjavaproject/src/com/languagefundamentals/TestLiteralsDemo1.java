package com.languagefundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		
		TestLiteralsDemo1 t = new TestLiteralsDemo1();
		System.out.println(t); // address of the object -> 1@1dbd16a6
		
		// Decimal Numbers : base is 10 -> 0 to 9
		int a1 = 10;
		int a2 = 123;
		
		// Octal Literals: any number starts with 0 will consider as Octal Literals.
		// Octal Base is (8) and Range is 0 to 7
		// 0*8^3 + 1*8^2 + 2*8^1 + 3*8^0 = 64 + 16 + 3 = 83.
		int a3 = 0123;
		
		int a4 = 0654;
		int a5 = 0741;
		
		// // The literal 0874 of type int is out of range
		// int a6 = 0874;
		
		// Hexa-Decimal Literals : Any number starts with 0x will consider as Hexa-Decmal Literals.
        // Hexa-Decimal Literal base is 16 : Range 0 to 9 & a-f/A-F 
		// a/A=10 b/B=11 c=12 d=13 e=14 f=15
		
		// 0 + 1*16^2 + 2*16^1 + 3*16^0 = 256 + 32 + 3 = 291 
        int a6 = 0x123;
        int a7 = 0x2b2fa4f7; // Hexa-Decimal value of the object will consider as Hashcode.
        int a8 = 0x1a2b;
        int a9 = 0XDAD;
		int a10 = 0xBee;
        // int a11 = 0xBeer; //Syntax error on token "r", delete this token
		
		// Binary Literals Base is 2 : Range is 0 to 1 
		// 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10
		int a12 = 0B1010;
		int a13 = 0b10101010;
		
		System.out.println(a1);	// 10
		System.out.println(a2);	// 123
		System.out.println(a3);	// 83
		
		System.out.println(a4); // 428
		System.out.println(a5); // 481
		
		System.out.println(a6); // 291
		System.out.println(a7); // 724542711
		System.out.println(a8); // 6699
		System.out.println(a9); // 3501
		System.out.println(a10); // 3054
		System.out.println(a12); // 10
		System.out.println(a13); // 170
	}

}
