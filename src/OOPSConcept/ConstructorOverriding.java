package OOPSConcept;

public class ConstructorOverriding extends ConstructorParent{
	@Override
	public void m1() {
		System.out.println("hi i am child method");
	}
public static void main(String[] args) {
	ConstructorOverriding obj=new ConstructorOverriding();
	obj.m1();
}
}


//constructor Overriding is not allowed because constructor can not be inherited