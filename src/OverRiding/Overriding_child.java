package OverRiding;

public class Overriding_child extends OverRiding_Parent{
@Override
public void m1() {								//we may increase the visibility
	super.m1();
	System.out.println("Hello i am from child");
}
public static void main(String[] args) {
	Overriding_child obj=new Overriding_child();
	obj.m1();
}
}
