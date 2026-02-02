package OOPSConcept;

public class ConstructorChild extends ConstructorParent{
	public ConstructorChild() {
		super();
	}


public static void main(String[] args) {
	new ConstructorChild();
}
}


//to call parent class constructor, we need to use super keyword 
// from the child class constructor
//which looks like 