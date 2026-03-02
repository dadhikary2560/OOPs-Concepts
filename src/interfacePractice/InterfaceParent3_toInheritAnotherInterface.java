package interfacePractice;

public interface InterfaceParent3_toInheritAnotherInterface extends InterfaceParent {
	@Override
	default void m1() {
		// TODO Auto-generated method stub
		System.out.println("only default method can be overriden"
				+ " which originally was an abstract method");
	}
	
}
