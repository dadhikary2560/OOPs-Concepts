package randomProgram;

public class ArrayDuplicate {
	private void m1(int arr1[], int arr2[]) {
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			boolean isDuplicate=false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{	
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate==true)
				System.out.print(arr1[i]+" ");
		}
	}
public static void main(String[] args) {
	int []x= {1,3,4,9,6,8};
	int[] y= {2,4,6,10,12,15};
	ArrayDuplicate obj=new ArrayDuplicate();
	obj.m1(x, y);
}
}
