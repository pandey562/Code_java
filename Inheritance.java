package Intrvew_Quest;


//MULTI-LEVEL INHERITANCE==
class A{
	void print1(int a, int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	void print2(int x, int y) {
		System.out.println(x-y);
	}
}
class C extends B{
	void print3(int s,int d) {
		System.out.println(s*d);
	}
}

public class Inheritance 
 {

	   public static void main(String[] args) 
        {

	          C obj=new C();
		      obj.print1(3,5);
		      obj.print2(2,5);
		      obj.print3(2,2);
	      }
  }





  //HIERARCHICAL INHERITANCE

//  class parent
//  {
//	int a;
//	void parents()
//	{
//		System.out.println("Parent: "+a);
//	}
//  }
//  
//  class Child1 extends parent
//  {
//	  int b;
//	  void child1()
//	  {
//		  System.out.println("Child1: "+b);
//	  }
//  }
//
//   class Child2 extends parent
//   {
//	   int c;
//	   void child2()
//	   {
//		   System.out.println("Child2: "+c);
//	   }
//   }
//
//   public class Inheritance 
// {
//
//	   public static void main(String[] args) 
//        {
//            Child1 obj=new Child1();
//            obj.a=11;
//            obj.b=12;
//          
//            obj.parents();
//            obj.child1();
//            
//            Child2 obj1=new Child2();
//            obj1.a=13;
//            obj1.c=14;
//            
//            obj1.parents();
//            obj1.child2();
//           
//	      }
//  }



