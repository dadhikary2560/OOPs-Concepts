package randomProgram;

import java.util.Arrays;

/*VERY IMPORTANT PROGRAM, AS IT DOES MULTIPLE THINGS
first it deletes duplicates, and replaces duplicates with 0's
then it moves the zeroes to the right 
third, sorts the array in ascending order*/

public class AscendingElements {

	//first shift zeroes to the right from the deleted duplicate elements array
	void m1(int arr[]) {
		int count=0;
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				temp[count]=arr[i];	//count is 0, so at temp[0]
				count++;				//count=1, so for next, temp[1]
				
				//as count increases, so does the index of temp increases
			}
			else
				continue;
		}
		System.out.println("prints the array while moving the 0's to the right");
		System.out.println(Arrays.toString(temp)+"count value is: "+count);
		
		int result[]=Arrays.copyOf(temp, count);
		System.out.println("prints the array without the 0's");
		System.out.println(Arrays.toString(result));
		
		//sorting the array in ascending order
		for(int i=0;i<result.length;i++)
		{
			for(int j=i+1;j<result.length;j++)
			{
				if(result[i]>result[j])
				{
					result[i]=result[i]+result[j];
					result[j]=result[i]-result[j];
					result[i]=result[i]-result[j];
				}
			}
		}
		System.out.println("prints the sorted array");
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,1,4,2,0,-11,2,1};
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicateFound=false;
			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
					isDuplicateFound=true;
			}
			if(isDuplicateFound)
				continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					continue;
				else
					temp[i]=arr[i];
			}
		}
		
		System.out.println("prints the array without duplicates");
		System.out.println(Arrays.toString(temp));
		AscendingElements obj=new AscendingElements();
		obj.m1(temp);
	}
}
