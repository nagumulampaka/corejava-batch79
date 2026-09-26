package com.javaintroduction;

class A {
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from A class");
	}
}

class B {
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from B class");
	}
}

// 5. IsLand Of Isolation
public class TestIsLandOfIsolation {

	public static void main(String[] args) {
		System.out.println("main method started");
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.b = obj2;
		obj2.a = obj1;
		
	    obj1 = null;
	    obj2 = null;
	    
		System.gc();
		
		System.out.println("main method ended");
		
	}

}
