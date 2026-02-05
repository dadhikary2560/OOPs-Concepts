package randomProgram;

public class IsInAscendingOrder {
public static void main(String[] args) {
	boolean isAscending=true;
	int arr[]= {20,12,15,17,18,19};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					{
						isAscending=false;
						break;
					}				
			}
	}
	if(isAscending==true)
		System.out.println("array is in ascending order");
	else
		System.out.println("array is not in ascending order");
}
}
