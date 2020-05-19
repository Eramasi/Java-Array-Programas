import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementsAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the length of the array :");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements in the array: ");
		int [] A=new int[n];
		int sum=0;
		int l=A.length;
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
			
		}
		
		System.out.println("Input Array is "+Arrays.toString(A));
		
		
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
		
		System.out.println("Remove Duplicate Elements in the array is :");
		for(int k=0;k<l;k++)
		{
			System.out.print(" "+A[k]);
			sum=sum+A[k];
			
		}
		System.out.println("-----------------");
		System.out.print("The Sum of Unique Elements in the array is :"+sum);

	}

}
