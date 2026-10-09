package com.languagefundamentals;

// == operator checks the values of the primitive data types
// == operator checks the addresses of the object Data Type.
// .equals method checks the content of the string objects.
public class TestLiteralsDemo3 {

	public static void main(String[] args) {
		
		char c5 = 'A';
		char c6 = 'A';
		System.out.println(c5 == c6); // true
		
		// String Literals
		// collection of characters keep it inside the double quotes and \
		// storing into a single variable will consider as a String.
		// String literals are storing inside a string constant pool.
		// String objects are storing inside the Heap area.
		
		String s1 = "Mulampaka Nagu";
		String s2 = "Mulampaka Nagu";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // true
		
		// null literals to use for objects only
		// we can use for any kind of objects to keep empty declaration.
		TestLiteralsDemo3 t1 = null;
		// String s2 = null;
		
		// boolean literals
		boolean boo = true; // true of false are the literals not keywords
		
		if(boo) { 
			System.out.println("Good Morning!!");
		}
		
		// char literals
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0040';
		char c4 = '\uafba';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		t1 = new TestLiteralsDemo3();
	}

}
