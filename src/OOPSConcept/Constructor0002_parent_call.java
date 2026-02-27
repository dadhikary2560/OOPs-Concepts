package OOPSConcept;

import java.util.Scanner;

public class Constructor0002_parent_call extends Constructor0001 {
	public Constructor0002_parent_call() {
		super();		//calls the parent class's no argument constructor
	}
	
	public void m1() {
		// super(15);    this is not allowed as m1 can only be called with the class objects
						// reference, however the super keyword calls the constructor directly
						//and it should be done at the time of object creation only
		
		
		super.normalMethod();	//normal methods can be called
	}
	
	//the normal method can be over-riden as we have a parent-child relationship
	@Override
	public void normalMethod() {
		// TODO Auto-generated method stub
		super.normalMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		System.out.println(a+b);;
	}
	
	
	public static void main(String[] args) {
		Constructor0002_parent_call obj=new Constructor0002_parent_call();
		obj.m1();
		
		System.out.println("----------------------------------------------");
		obj.normalMethod();
	}
}
