package randomProgram;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int j=arr.length-1;
	for(int i=0;i<=arr.length/2;i++)
	{
		for(;j>arr.length/2;)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			j--;
			break;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
