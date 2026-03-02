package randomProgram;

import java.util.Arrays;
import java.util.Scanner;




//Calculate the sum of first n natural numbers.
public class Loop_Practice {
	private void first(int series, Scanner sc) {
		int n=0;
		int sum=0;
		for(int i=0;i<series;i++)
		{
			n=sc.nextInt();
			sum=sum+n;
		}
		System.out.println("sum of all in the series: "+sum);
	}
//Count how many numbers in an array are greater than 50.
	private void second(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>50)
				count++;
		}
		System.out.println("total count of numbers greater than 50: "+count);
	}
	
//Reverse the elements of an array using a loop.
	private void third() {
		int arr[]= {11,2,34,4,15};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
		System.out.println("reverse array is: ");
		System.out.println(Arrays.toString(arr));
	}
	
	//Print the first n Fibonacci numbers.
	private void fourth(Scanner sc) {
		System.out.println("enter the last number for the fibonacci series");
		int n=sc.nextInt();
		
		int a=0, b=1;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=a+b;
			System.out.print(a+" ");
			a=b;
			b=sum;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Loop_Practice obj=new Loop_Practice();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want in the series");
		int n = sc.nextInt();
		obj.first(n, sc);
		
		int arr[]=new int[n];
		System.out.println("enter numbers for array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.second(arr);
		obj.third();
		obj.fourth(sc);
		sc.close();
	}
}
