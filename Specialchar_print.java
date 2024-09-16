package Intrvew_Quest;

public class Specialchar_print
{

	public static void main(String[] args)
	{		//PRINT SPECIAL CHARACTER ONLY IN GIVEN STRING
		
		String  str= "1ahdj2#@!3$*#mc#%fj^g*(D)";
		for(int i=0; i<str.length(); i++)
		{  
			char c= str.charAt(i);
			if(!Character.isLetterOrDigit(c))
			{
				System.out.print(c);
			}
		}
		
	}
}
