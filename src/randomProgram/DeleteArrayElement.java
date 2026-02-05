package randomProgram;

import java.util.Arrays;

//DeleteElementFromArray
//int []x= {15,25,1,97,785,2005,41};
//		int deletElement=97;
public class DeleteArrayElement {
public static void main(String[] args) {
	int []x= {15,25,1,97,785,2005,41};
	int num=97;
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==num)
		{
			for(int j=i;j<x.length-1;j++)
			{
				x[j]=x[j+1];
			}
			x[x.length-1]=0;
		}
	}
	System.out.println(Arrays.toString(x));
}
}
