package randomProgram;

import java.util.Arrays;
import java.util.Scanner;

//Copy elements from one array to another.

public class CopyElements {
	public int[] m1(int a1[]) {
		int length=a1.length;
		int arr2[]=new int[length];
		
		for(int i=0;i<arr2.length;i++)
			arr2[i]=a1[i];
	return arr2;
	}
	
	//Find the average of array elements.
	void m2(int a2[]) {
		int sum=0;
		for(int i=0;i<a2.length;i++)
			sum=sum+a2[i];
		float average=(float)sum/a2.length;
		System.out.println("average of the array is: "+average);
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of the array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter elements for the array");
	for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
	sc.close();
	CopyElements obj=new CopyElements();
	System.out.println(Arrays.toString(obj.m1(arr)));
	
	obj.m2(arr);
}
}
