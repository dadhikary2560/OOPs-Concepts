package abstraction;

public abstract class NormalClass_IMP extends AbstractParent_IMP{
//public class NormalClass extends AbstractionParent
	//if we write like this, by default we have to override all the methods
	//that belongs to the abstract class
	
	//but if we make the child class abstract itself then there is no need to
	//over-ride all the methods or no methods from the abstract class
	
	@Override
	public void m1() {
		System.out.println("extending parent class's feature in the child class");
	}
	
	public NormalClass_IMP() {
		System.out.println("hi i am constructor");
	}
	
}
//creation of object is only allowed in normal class not in abstract class