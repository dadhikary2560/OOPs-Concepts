package OOPSConcept;

public class ConstructorOverloading {
	public ConstructorOverloading() 
	{
	System.out.println("Hello world");
	}
	
	public ConstructorOverloading(int x)
	{
		int a=x;
		System.out.println("value of a: "+a);
	}
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(12);
	}
}
