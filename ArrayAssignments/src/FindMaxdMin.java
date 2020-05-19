
public class FindMaxdMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2, 5, 1, 7, 3, 9, 5};
		int Max=arr[0];
		int SecondMax=arr[0];
		int Min=arr[0];
		int SecondMin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<Min)
			{
				Min=arr[i];
			}
			else if(arr[i]<SecondMin)
			{
				SecondMin=arr[i];
			}
			else if(arr[i]>Max)
			{
				Max=arr[i];
			}
			else if(arr[i]>SecondMax)
			{
				SecondMax=arr[i];
			}
		}
		System.out.println("The Smallest Number in the array is :" +Min);
		System.out.println("The Largest Number in the array is :" +Max);
		System.out.println("The Second Smallest Number in the array is :" +SecondMin);
		System.out.println("The Second Maximum Number in the array is :" +SecondMax);
		System.out.println("The Smallest Pair Sum in the array is :"+(Min+SecondMin));
		System.out.println("The Maximum Difference is :"+(Max-Min));
		
		
	}

}
