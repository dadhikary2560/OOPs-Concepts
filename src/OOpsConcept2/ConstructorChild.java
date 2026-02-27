package OOpsConcept2;

import OOPSConcept.ConstructorParent;

public class ConstructorChild extends ConstructorParent{
public static void main(String[] args) {
	new ConstructorChild();
}
}


//we can only make parent-child relation
//because child must have it's own constructor
//from there we can call parent class constructor with the help of the super keyword

//it's not like we can directly get the parents method