import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElements {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int n=sc.nextInt();
		int A[] =new int[n];
		int l=A.length;
		System.out.println("Enter All The Elements in The Array:");
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Input Array Is: "+Arrays.toString(A));
		
		System.out.println("Duplicate Elements in the Array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
				{
					System.out.println(A[i]);
				}
			}
		}
		
		System.out.println("Remove Duplicate Elements in The Array is :");
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(A[i]==A[j])
				{
					A[j]=A[l-1];
					l--;
					
				}
			}
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.print(" "+A[i]);
		}
		System.out.println("-----------------");
		System.out.println("The Sum of Unique elements is :");
		int sum=0;
		for(int i=0;i<l;i++)
		{
			sum=sum+A[i];
		}
		System.out.println(" "+sum);

	}

}
