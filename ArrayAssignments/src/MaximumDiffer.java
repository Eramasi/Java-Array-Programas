import java.util.Arrays;
import java.util.Scanner;

public class MaximumDiffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Enter size of Array:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter Elements in the Array:");
	int []arr=new int[n];
	int l=arr.length;
	System.out.println("The length of array is:"+l);
	for(int i=0;i<l;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Input Array is: "+Arrays.toString(arr));
	
	int Min=arr[0];
	int Max=arr[0];
	
	for(int i=0;i<l;i++)
	{
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
			else if(arr[i]<Min)
			{
				Min=arr[i];
			}
		}
	
		System.out.println("The Maximum Number in the Array is: "+Max);
		System.out.println("The Minimum Number in the Array is: "+Min);
		System.out.println("The Maximun Difference is :"+(Max-Min));
	
	

	}

}
