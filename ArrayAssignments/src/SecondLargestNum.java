import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the length of Array :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
	
		int []arr= {4,8,9,7,3,20};
		int temp;
		int size1=arr.length;
		for(int i=0;i<size1;i++)
		{
			for(int j=i+1;j<size1;j++)
			{
				if(arr[i]> arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		
		System.out.print(" "+arr[i]);
		}
		System.out.println("-----------");
		System.out.println("The Second Largest Number in the Array is "+arr[size1-2]);
	}

}
