package MyOwnPractice;

public class Methods {
	
	
	public void test()
	{
		System.out.println("This is test method");
	}
	
	public void substraction()
	{
		int a = 200;
		int b = 100;
		int c = a-b;
		System.out.println("This is the substraction of two number -> "+c);
	}
	
	public void addition(int p,int q)
	{
		int r = p+q;
		System.out.println("This is the addition of two number -> "+r);
	}
	
	public int division()
	{
		int s = 10;
		int t = 5;
		int u = s/t;
		System.out.println("This is the division of two number -> ");
		return u;
	}
	
	
	public void multiplication(int v,int w)
	{
		int x = v*w;
		System.out.println("The multiplication of "+v+" "+"and"+w+" "+"is -> "+x);
	}
	
	public static int add(int f,int g)
	{
		int h = f+g;
		return h;
	}
	
	
	public static void main(String[] args) {
		
		Methods mt = new Methods();
		
		mt.addition(100, 200);
		
		System.out.println(mt.division());  //non void method use in print statement
		
		mt.multiplication(47, 39);
		
		mt.substraction();
		
		mt.test();
		
		System.out.println(add(200,500));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
