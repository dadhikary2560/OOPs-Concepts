package randomProgram;

import java.util.Arrays;

public class DuplicateElements {
	
	//Print unique elements in an array.
	private void m1(int arr[]) {
		System.out.println("unique elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			boolean isFound=false;
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
					isFound=true;
			}
			if(isFound)
				continue;
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count<1)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//Remove duplicate elements from an array.
	private void m2(int arr[]) {
		System.out.println(Arrays.toString(arr));
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			boolean isFound=false;
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
					isFound=true;
			}
			if(isFound)
				continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					continue;
				else
					temp[i]=arr[i];
			}
		}
		int count=0;
		for(int i=0;i<temp.length-count;i++)
		{
			if(temp[i]==0)
				continue;
			System.out.print(temp[i]+" ");
		}
	}
	
public static void main(String[] args) {
	//Print duplicate elements in an array.
	int arr[]={1,2,3,1,4,2,0,-11,2,1};
	for(int i=0;i<arr.length;i++)
	{
		boolean isFound=false;
		for(int k=0;k<i;k++)
		{
			if(arr[i]==arr[k])
			{
				isFound=true;
				break;
			}
		}
		if(isFound)
			continue;
		int count=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				break;
			}
		}
		if(count>0)
			System.out.println("duplicate exists for "+arr[i]);
	}
	DuplicateElements obj=new DuplicateElements();
	obj.m1(arr);
	obj.m2(arr);
}
}
