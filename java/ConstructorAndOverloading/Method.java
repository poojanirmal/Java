package ConstructorAndOverloading;

//import java.util.Scanner;

public class Method {
	
	
	String name;
	int n;
	static int k;
	
	
	public int addition(int a,int b)
	
	{
		System.out.println("Addition of two number");
		 int c = a+b;
		return c;
	}
	
	public void test()
	{
		System.out.println("This is test method");
		int d = 9;
		int f = 3;
		
		int g = d/f;
		System.out.println("The division of number -> "+g);
	}
	
	public static int substraction()
	{
		int a = 20;
		int b = 10;
		System.out.println("substract the two number");
		int c = a-b;
		return c;
	}
	
	public static int substraction1(int i,int p)
	{
		System.out.println("substract the two number");
		int c = i-p;
		return c;
	}
	
	public void userName(String name)
	{
		System.out.println("The name of user");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Method ref = new Method();
		
		
		
//		 System.out.println("Please enter the number");//return the argument of non void method
//			Scanner sc1 = new Scanner(System.in);
//			int i = sc1.nextInt();
//			int p =sc1.nextInt();
//			sc1.close();
//		
//		ref.addition(i, p);
	
//		System.out.println(ref.addition(i, p));
	
		
		System.out.println(ref.addition(20, 30));
		
		ref.test();//calling the non static method
//		substraction1(10,20);//calling  static method having two parameter
		System.out.println( substraction1(10,20));
		
		System.out.println(Method.substraction());
		
		
		 ref.name = "pooja";//calling the instance variable
		System.out.println(ref.name);
		
		k = 100;
		System.out.println(k);//calling static instance variable
		
		ref.userName("rahul"); //calling the method having one parameter
//		System.out.println(ref.userName("rahul"));
		
		
//		VOID METHOD ARE NOT CALLED IN PRINTING STATEMENT.
		
		
		
	}
	
	
	

}
