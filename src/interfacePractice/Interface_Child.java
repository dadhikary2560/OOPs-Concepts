package interfacePractice;


public class Interface_Child implements InterfaceParent {

	@Override
	public void m1() {
		//over-riden method of parent interface
		System.out.println("from parent interface");
	}
	
	public static void main(String[] args) {
		Interface_Child obj=new Interface_Child();
		obj.m1();
		System.out.println(x);
		
		InterfaceParent.m3();
	}

}
