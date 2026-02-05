package randomProgram;


//int[] x = { 2, 5, 11, 25, 101, 35, 1001 }; //FindMaxElement
public class MaxElement {
public static void main(String[] args) {
	int[] x = { 2, 5, 11, 25, 101, 35, 1001 };
	int max=x[0];
	for(int i=1;i<x.length;i++)
	{
		if(x[i]>max)
			max=x[i];
	}
	System.out.println(max);
}
}
