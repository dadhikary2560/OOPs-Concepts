package randomProgram;


//Find the second largest element in an array.
public class SecondLargest {
	//Find the second smallest element in an array.
	private void m1(int arr2[]) {
		int smallest=arr2[0];
		int secondSmall=0;
		for(int i=1;i<arr2.length;i++)
		{
			if(arr2[i]<smallest)
			{
				secondSmall=smallest;
				smallest=arr2[i];
			}
			else if(arr2[i]<secondSmall && secondSmall!=smallest)
				secondSmall=arr2[i];
		}
		System.out.println("secondSmallest number is: "+secondSmall);
	}
	
public static void main(String[] args) {
	int arr[]= {-55,10,4,-20,2,1,7,-10};
	int large=arr[0];
	int secondLarge=0;
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>large)
		{
			secondLarge=large;
			large=arr[i];
		}
		else if(arr[i]>secondLarge && secondLarge!=large)
			secondLarge=arr[i];
	}
	System.out.println("second largets element in the array is: "+secondLarge);
	SecondLargest obj=new SecondLargest();
	obj.m1(arr);
}
}
