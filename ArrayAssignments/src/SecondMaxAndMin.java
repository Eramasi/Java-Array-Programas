import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the length of array :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements in tha array is:");
		int [] arr=new int[n];
		int size=arr.length;
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Input Array is:"+Arrays.toString(arr));
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		System.out.print(" "+arr[i]);
		}
		System.out.println("-----------------------------");
		System.out.println("The scond Max Number in the array is:"+arr[size-2]);
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		System.out.print(" "+arr[i]);
		}
		System.out.println("-----------------------------");
		System.out.println("The scond Min Number in the array is:"+arr[size-2]);
		
		
		
	
		}
		
		
	}


