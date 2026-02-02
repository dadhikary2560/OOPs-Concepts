package overLoading;


//concept is related to same class only
public class OverLoading {
public void methodM1() 
{
	System.out.println("this is concrete method");
}
public void methodM1(int a)
{
	System.out.println("overloading starts here, different parameter");
}
public static void main(String[] args) {
	OverLoading m1=new OverLoading();
	m1.methodM1();
	m1.methodM1(12);
}
}
