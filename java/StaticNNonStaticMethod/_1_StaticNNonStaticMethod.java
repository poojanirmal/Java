package StaticNNonStaticMethod;

public class _1_StaticNNonStaticMethod {
//	Variable - variables are container for storing the data values
//	Local variables - declared inside the body of method or method parameter
//	Instance variable - declared inside the class but outside the all method
//	static variable - declared with help of static keyword
	
//	Instance Variable
	
	int a = 10;
	int b = 20;
	static int i = 40;
	static int p = 20;

	 
//	Non Static Method
	
	public void Add1 () 
	{		
		 
	System.out.println(a+b);	
	
	}
	
 
	
     public static void Div() //we not using the non static variable in static method. we have to create static variable.
     {
	System.out.println(i/p);
     }


       public static void main(String[] args)
      {

	 _1_StaticNNonStaticMethod xc = new _1_StaticNNonStaticMethod ();// object -it should be in main method 
	 xc.Add1();
	 Div();//static method used directly without using object referenced name
	 
     }




	
////	Another Way of Coding
//
//public static void main(String[] args) 
//{
//	
//	_1_StaticNNonStaticMethod xc = new _1_StaticNNonStaticMethod ();// Object Name
//	
//	int i = 10;
//	
////	static int i = 40; only have local variable inside of main methods
//	static int p = 20; error - illegal modifier for parameter p;only final is permitted
//	
//	xc.Add();
//	Div();
//}
//	
//	
//public void Add () 
//{
//	int a = 10;
//	int b = 20;
//System.out.println(a+b);	

//}
	
	
//	1.instance variable
// 2. static and non static method - print statement(a/b)
// 3. main method - object and return statement
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
