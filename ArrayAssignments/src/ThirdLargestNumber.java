import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Size of Array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter all the elements in the array is :");
		int []A=new int[n];
		int l=A.length;
		int temp;
		
		
		for(int i=0;i<n;i++)
		{
		   A[i]=sc.nextInt();
		}
		System.out.println("Input Array is :"+Arrays.toString(A));
		
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					
					
				}
			}
			System.out.print(" "+A[i]);
	}
		System.out.println("----------------");
		
		
		System.out.println("Third Largest number is : "+A[l-3]);
	
	}
}
