package com.corejava.practice;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] array= {45,89,68,78,36,36};
		long sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("The sum of array is: "+sum);
		int[] array1= {1,2,5,6,2,7,5,9,1};
		System.out.println("The Dupilcate Elements in the array is:");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]==array1[j])
				{
					System.out.print(" "+array1[i]);
					
				}
			}
		}
		System.out.println("-------------------------");*/
		
		  
		int A[]= {1,2,2,3,4,5,6,7,5,7};
		int sum1=0;
		int l=A.length;
		System.out.println("Input Array is :");
		for(int i=0;i<l-1;i++)
		{
			System.out.print(" "+A[i]);
		}
		
		
		System.out.println("-----------------");
		System.out.println("Duplicate Elements in the Array is: ");
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l-1;j++)
			{
				if(A[i]==A[j])
				{
					System.out.print(" "+A[i]);
				}
			}
		}
		 System.out.println("---------------");
		System.out.println("Unique Elements in the Array is :");
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
		System.out.println();
		
		
		for(int i=0;i<l;i++) {
		
		sum1=sum1+A[i];
	}
		System.out.println("------------------");
		System.out.println("The Sum of Unique Elements in Array is: "+sum1);
	}
}
