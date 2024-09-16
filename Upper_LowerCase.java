package Intrvew_Quest;

public class Upper_LowerCase {

	public static void main(String[] args)
	{
		String str= "aBcDEfeGHiJk";
        String Lowercase="";
        String Uppercase="";
        
        for(char ch: str.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
            	Lowercase=Lowercase+ch;
            }
            else
            {
            	Uppercase=Uppercase+ch;
            }
           System.out.println(Lowercase);
           System.out.println(Uppercase);
            
            
            
        }
	}
}
