package randomProgram;

import java.util.Arrays;

//Print prime numbers from an array.

public class PrimeNumbersInArray {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
	int[] arr2 = {121, 34543, 12321, 1001, 404, 10, 1010, 123, 90, 11, 7, 0, -121, -22, 100};
	
	private int m1() {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime=true;
			if(arr[i]<2)
				continue;
			for(int k=2;k<arr[i];k++)
			{
				if(arr[i]%k==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.println();
		return count;
	}
	
	
	//Print palindrome numbers from an array.
	private void m2() {
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr2.length;i++)
		{
			int num=arr2[i];
			int rem=0, reverse=0;
			while(num>0)
			{
				rem=num%10;
				reverse=reverse*10+rem;
				num=num/10;
			}
			if(num<0)
				System.out.println("negative number: "+num);
			if(reverse==arr2[i])
				System.out.print(arr2[i]+" ");
		}
	}
	private void armstrong() {
		int[] arr = {0, 1, 2, 9, 10, 100, 153, 370, 371, 407, 1634, 8208, 9474, 9475, 999, -153};
		System.out.println("armstrong numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			
			int num=arr[i];
			int rem=0, arms=0;
			while(num>0)
			{
				rem=num%10;
				arms=(int) (arms+Math.pow(rem, 3));
				num=num/10;
			}
			if(arms==arr[i])
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		PrimeNumbersInArray obj=new PrimeNumbersInArray();
		System.out.println("total prime number found: "+obj.m1());
		obj.m2();
		obj.armstrong();
	}
}
