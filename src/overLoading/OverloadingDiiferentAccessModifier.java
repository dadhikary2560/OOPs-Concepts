package overLoading;

public class OverloadingDiiferentAccessModifier {

	private void m1() {
		System.out.println("this is a normal method");
	}
	void m1(int a) {
		int x=9;
		x=x+a;
		System.out.println("value of x: "+x);
	}
	protected void m1(int a, int b) {
		for(int i=a;i<=b;i++)
			System.out.print(i+" ");
	}
	//all above methods are having different access modifiers
	
	
	public static void main(String[] args) {
	OverloadingDiiferentAccessModifier obj=new OverloadingDiiferentAccessModifier();
	obj.m1();
	obj.m1(7);
	obj.m1(7, 15);
}
}
