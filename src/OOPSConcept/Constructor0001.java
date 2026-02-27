package OOPSConcept;

public class Constructor0001 {
	
	//type-	NO ARGUMNET CONSTRUCTOR 
	public Constructor0001() {
		System.out.println("prints the first line of constructor");
	}
	
	
	//type-	Argument Constructor
	public Constructor0001(int a)
	{
		this();		//calls the no argument constructor, which is same class context
		System.out.println("received value: "+a);
	}
	
	public void normalMethod() {
		System.out.println("i am normal method from test0001");
	}
	
public static void main(String[] args) {
	new Constructor0001();	//constructor can not be static as it used to initialize objects
	new Constructor0001(0);	//to invoke argument constructor
}
}
