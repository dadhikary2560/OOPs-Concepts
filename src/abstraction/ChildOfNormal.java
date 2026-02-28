package abstraction;

public class ChildOfNormal extends NormalClass_IMP {

	@Override
	public void m2() {
	}

	@Override
	public void m3() {
	}

	@Override
	public void m4() {
	}

	@Override
	public void m5() {
	}

	@Override
	public void m6() {
	}

	public static void main(String[] args) {
		ChildOfNormal obj = new ChildOfNormal(); // calls the constructor ChildOfNormal()
		obj.m1();
		System.out.println(obj.x);
	}

}
