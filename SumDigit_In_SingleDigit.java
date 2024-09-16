package Intrvew_Quest;

public class SumDigit_In_SingleDigit 
{
	
	public static void main(String[] args)
{
	//[7]===SUM OF DIGITS INTO SINGLE DIGIT
	long[]x= {1,223,213123,42323,235};
	long sum=0;
	for(int i=0; i<x.length; i++)
	{
		sum=sum+x[i];
		
	}System.out.println(sum);
	long sum1 = 0;
	while(sum>0)
	{
		sum1=sum1+sum%10;
		sum=sum/10;
	}System.out.println(sum1);
	long sum2=0;
	while(sum1>0)
	{
		sum2=sum2+sum1%10;
		sum1=sum1/10;
	}System.out.println("sum in one digit= "+sum2);
	
}
}
