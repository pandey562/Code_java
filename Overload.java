package Intrvew_Quest;

public class Overload {
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a-b+c);
	}
	void add(double a, double b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Overload s=new Overload();
		s.add(2,8,9);
		s.add(22,34);
		s.add(34.4,9.6);
	}

}
