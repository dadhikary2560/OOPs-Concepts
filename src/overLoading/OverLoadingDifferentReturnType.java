package overLoading;

public class OverLoadingDifferentReturnType {
	int a;
	public int m1(int b) {
		System.out.println("value of a: "+a); //a is 0 given by default constructor
		return a+b;
	}
	public String m1() {
		return "Hello";

	}
	public void m1(byte a) {
		System.out.println("taking byte as input");
	}
	
	
public static void main(String[] args) {
	OverLoadingDifferentReturnType obj=new OverLoadingDifferentReturnType();
	System.out.println(obj.m1(5));
	System.out.println(obj.m1());
	obj.m1((byte)4);					//need to write byte, as java take any value as int
}
}
