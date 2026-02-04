
public class RecursionPractice {
	int count=1;
	private void m1() {
		System.out.println("Hellow World");
		while(count<10)
		{
			count++;
			m1();
		}
	}
	public static void main(String[] args) {
	RecursionPractice obj=new RecursionPractice();
	obj.m1();
}
}
