package Session_15;

public class _3_TryCatch {
	
	static int x = 9;
	static int y = 0;
	
	public void division(int a,int b)
	{
//		this.x = a;
//		this.y = b;
		int c = a/b;
		System.out.println("The division of input is -> "+c);
	}
    public static void main(String[] args) {
	
    	_3_TryCatch tc = new _3_TryCatch();
	
	try
	{
		tc.division(9, 0);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println("An exception occured inside the division method");
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
		System.out.println("An exception occured inside the division method");
	}
	catch(Exception e)  //this catch block always at the end... this is the parent class in exception
	{
		e.printStackTrace();
		System.out.println("An exception occured inside the division method");
	}
	
	
	
	
}
}
