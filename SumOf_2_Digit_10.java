package Intrvew_Quest;

public class SumOf_2_Digit_10 {

	public static void main(String[] args) {
	
		//SUM OF 2 DIGIT IS EQUAL TO 10 NUMBER
		
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==10)
				{
					System.out.println(arr[i]+"+"+arr[j]+"=10");
				}
			}
		}
		
		
	}

}
