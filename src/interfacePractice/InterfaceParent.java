package interfacePractice;


public interface InterfaceParent {
	void m1(); // so this is abstract method

	int x = 10; // or public static final int x=10;
				// by default all variables are static final in interface

	default void m2() {
		System.out.println("from 1.8 no concept such as 100% abstraction");
		System.out.println("if an interface has only " + 
		"one method, it is termed as functional interface");
	}
	
	//static method can not be directly inherited or 
	//can not be accessed by the child class though it's a static method
	
	//can be only accessed through the Interface only
	public static void m3() {
		System.out.println("from 1.8 java allows static method");
	}
}
