package OOPSConcept;


//example of constructor overloading
public class Constructor0003_overloading {
	public Constructor0003_overloading() {
		System.out.println("no argument constructor");
	}
	public Constructor0003_overloading(int a) {
		System.out.println("one argument constructor");
		System.out.println("value of received element: "+a);
	}
	public Constructor0003_overloading(int a, int b) {
		System.out.println("two argument constructor");
		System.out.println("value of first received element: "+a);
		System.out.println("value of second received element: "+b);
		System.out.println("addition of the two values: "+(a+b));
	}
	
	public static void main(String[] args) {
		new Constructor0003_overloading();
		System.out.println("------------------------------------------------------");
		new Constructor0003_overloading(5);
		System.out.println("------------------------------------------------------");
		new Constructor0003_overloading(5,6);
	}
}
