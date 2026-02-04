package OverRiding;

public class OverridingChild extends OverridingParent{
@Override
public void m1() {
	for(int i=1;i<=5;i++)
	{
		for(int star=1;star<=i;star++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	//super.m1(); //calls the parent method
}
public static void main(String[] args) {
	OverridingChild obj=new OverridingChild();
	obj.m1();
	
	// to see parent's method at work
	OverridingParent obj2=new OverridingParent();
	obj2.m1();
}
}
