package Intrvew_Quest;

class Bank                                     //parent class
{
	double RateOfInterest()
	{
		return 9.0;
		
	}
}


class HDFC  extends Bank                              //CHILD CLASS
{
	double RateOfInterest()   //method overridden definition same but body's set of code is changed
	{
		return 6.0;
		
	}
}

class SBI extends Bank                             //CHILD CLASS
{
	double RateOfInterest()             //Method definition same
	{
		return 5.0;                    //Method body changed that is overridden
	}
}

class PNB extends Bank                //CHILD CLASS
{
	double RateOfInterest()
	{
		return 7.0;
	}
}

public class Override_example 
{

	public static void main(String[] args) 
	{
		HDFC hdfc=new HDFC();    // object created 
		SBI sbi=new SBI();        // object created
		PNB pnb=new PNB();        // object created
		
		System.out.println(hdfc.RateOfInterest());
		System.out.println(sbi.RateOfInterest());
		System.out.println(pnb.RateOfInterest());
		
	}

 }
