package OverRiding;

public class OverridingChild_updated extends OverridingUpdated_parent{
	@Override
	protected void m1() {
		// TODO Auto-generated method stub
		super.m1();
		System.out.println("child class's m1 method");
	}
	@Override
	 protected void m2() //m2 has increase in visibility default -> protected
	{
		// TODO Auto-generated method stub
		super.m2();
		System.out.println("overridden m2 method");
	}
	
	//m1 and m2 are now child class's method
	//the first line which uses the keyword super is to call the parent class method
	//static context can not be overriden as static contect are compile time thing
	
	public static void main(String[] args) {
		OverridingChild_updated.m3(); 	//to call the static method
		System.out.println("----------------------------------------");
		OverridingChild_updated obj=new OverridingChild_updated();
		obj.m1();
		obj.m2();
		
	}

}
