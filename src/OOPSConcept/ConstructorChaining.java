package OOPSConcept;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println("running default constructor");
	}
	public ConstructorChaining(int a) {
		this();		//calls default constructor
	}
	public ConstructorChaining(int a, String b) {
		this(24);
		System.out.println("value of integer is: "+a+" string value: "+b);
	}
	public ConstructorChaining(int a, int b) {
		this(24, "dev");
	}
	
	public static void main(String[] args) {
	new ConstructorChaining(24,24);
}
}
