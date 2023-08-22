package Session_15;

public class _2_TryCatch {
	
//	Handling iside the method
	
	public void div(int a,int b)
	{
		try
		{
			int c = a/b;
			System.out.println("the division of input "+a+"and"+b+"is -> "+c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("An exception occured inside the div method");
		}
		
		
	}

	public static void main(String[] args) {
		
		_2_TryCatch tc = new _2_TryCatch();
		
		
//		Handling Exception at method calling level
		
//		try 
//		{
//			tc.div(9, 0);
//		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//			System.out.println("An exception occured inside the div method");
//		}
		
		
		tc.div(9, 0);
		
		
	}
}
