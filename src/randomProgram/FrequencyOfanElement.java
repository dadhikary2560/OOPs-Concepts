package randomProgram;


//Count frequency of each element in an array.
public class FrequencyOfanElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,4,2,0,-11,2};
	
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
		int count=1;
		if(isFound)
			continue;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
				count++;
		}
		System.out.println("the element "+arr[i]+" has appeared "+count+" times");
	}
}
}
