package Session_16;

public class _1_FinallyBlock {

	public static void main(String[] args) {
		
		
	int a = 10;
//	try
//	{
//		System.out.println("Division Process......");
////		int k = a/5;
//		
//		int k = a/0;
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//		System.out.println("some exception occured...");
//	}
////	optional block
//	finally  //This block excecutes every time whether the exception caught by catch block or not
//	{
//		System.out.println("Process ended....");
//	}
		
	
//	try
//	{
//		System.out.println("Division Process......");
////		int k = a/5;
//		
//		int k = a/0;
//	}
//	catch( NullPointerException e)
//	{
//		e.printStackTrace();
//		System.out.println("some exception occured...");
//	}
////	optional block
//	finally  //This block excecutes every time whether the exception caught by catch block or not
//	{
//		System.out.println("Process ended....");
//	}	
		
	try
	{
		System.out.println("Division Process...");
		int k = a/0;
	}
	finally
	{
		System.out.println("Process ended...");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
