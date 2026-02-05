package abstraction;

public class AbstractChild extends AbstractionParent {

	@Override
	public void m1() {
		System.out.println("over-rided abstract method from Parent Class");
		
	}

	@Override
	public int m2() {		//increasing visibility from protected to private
		return 10;
	}
	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.m1();
		System.out.println(obj.m2());
	}

}
