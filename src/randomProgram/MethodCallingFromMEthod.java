package randomProgram;

public class MethodCallingFromMEthod {
public void m1() {
	System.out.println("this is method m1");
}
public void m2() {
	//calling m1
	System.out.println("this is method m2");
	m1();
}
public static void main(String[] args) {
	MethodCallingFromMEthod obj=new MethodCallingFromMEthod();
	obj.m2();
}
}
