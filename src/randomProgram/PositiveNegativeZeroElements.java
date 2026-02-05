package randomProgram;

import java.util.Scanner;

public class PositiveNegativeZeroElements {
	int positive, negative, zeroElements;
	public void m1(int a1[]) 
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>0)
				positive++;
			else if(a1[i]==0)
				zeroElements++;
			else if(a1[i]<0)
				negative++;
		}
		System.out.println("positive count is: "+positive);
		System.out.println("negative count is: "+negative);
		System.out.println("zero elements count: "+zeroElements);
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("what should be the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter elements in the array");
	for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
	sc.close();
	PositiveNegativeZeroElements obj=new PositiveNegativeZeroElements();
	obj.m1(arr);
}
}
