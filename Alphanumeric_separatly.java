package Intrvew_Quest;

public class Alphanumeric_separatly {

	public static void main(String[] args) {
	
		
  //[10]===PRINT NUMBER and STRING SEGREGATELY FROM ALPHANUMERIC STRING
	 String str="H123SHF4hdu2sbx";
	 String str1="";
	 String num="";
	 
	 for(int i=0; i<str.length(); i++)
	 {
		 char c=str.charAt(i);
		 if(c>='0' && c<='9') 
		 {
			 num=num+c;
		 }
		 else if(c>='a'||c>='A' && c<='z'|| c<='Z') 
		 {
			 str1=str1+c;
		 }
	 }System.out.println(num);
	 System.out.println(str1);
	
	}

}
