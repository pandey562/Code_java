package Intrvew_Quest;

public class Sum_Of_Even_Num {

	public static void main(String[] args)
	{
		 //[10]===SUM OF EVEN NUMBER ONLY
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even no.s is "+arr[i]);
				sum=sum+arr[i];
			}	
		}System.out.println("Total even no. is ="+sum);
	}

}
