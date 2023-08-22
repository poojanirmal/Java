package Session_15;

public class _1_TryCatch {
	
//	Exception - it is un expected situation where java is unable to proceed with the code and further flow of program breaks 
//	Examples - 1.any value divided by zero
//	           2.Accessing any value out of the range of the array
//	Exception handling - to do make the execution of a program unintrupted, we shou;d handle the exception
//	Errors    - it indicated serious problems and abnormal conditions that most application should not try to handled.
//	            Erroe defines problems that are not expected to be caught under normal circumstances by our program.
//	           for examples - memory errors,hardware errors jvm errors
	
	public static void main(String[] args) {
		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		int i = 9/0;          //showing the exception
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
//		System.out.println("G");
		
		
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try 
		{
		int i = 9/0;          //showing the exception
		}
		catch(Exception e)      // e is just the reference variable name for exception, can even write other reference variable name
		{
		    e.printStackTrace();    //this will print the proper hierarchy from where the exception is coming
		    System.out.println("Exception occure at i due to divided by zero");  //user defined massage for more clarification
		}
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		System.out.println("G");
		
		
		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		try 
//		{
//		int i = 9/0;          //showing the exception
//		}
//		catch(NullPointerException e)      // e is just the reference variable name for exception, can even write other reference variable name
//		                                   // by using wrong exception name still throwing exception
//		{
//		    e.printStackTrace();    //this will print the proper hierarchy from where the exception is coming
//		    System.out.println("Exception occure at i due to divided by zero");  //user defined massage for more clarification
//		}
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
//		System.out.println("G");
		
		
	}

}
