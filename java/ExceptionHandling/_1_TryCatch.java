package ExceptionHandling;

public class _1_TryCatch {
	
	
	public  static void div(int a,int b)
	{
//		1st way  - used try catch block in method
		try 
		{
			int c = a/b;
			 System.out.println("The division of two number -> "+c);
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 
			 System.out.println("The division of two number");
		}
		
	}
	
	public static void main(String[] args) {

//		2nd way  - used try catch block in main method
//		try
//		{
//			_1_TryCatch.div(9, 0);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			 System.out.println("The division of two number");
//		}
//		

		
		_1_TryCatch.div(9, 0);
		
		
		
	}
	
}
