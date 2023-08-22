package Session_15;

import ExceptionHandling._3_ThrowsExeption;

public class _4_Throws {

	public void launchUrl()throws Exception
	{
		System.out.println("url launch..");
		openBrowser();
	}
	
	public void openBrowser()throws Exception
	{
		System.out.println("Browser open..");
		loginPage();
	}
	
	public void loginPage()throws Exception
	{
		System.out.println("Do login..");
		int i = 9/0;
		

	}
	
	public static void main(String[] args) throws Exception{  //but this is not the right exception handling 
		
		_3_ThrowsExeption te = new _3_ThrowsExeption();
//		try
//		{
//			te.launchUrl();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Exception is handled..");
//		}
		
		
		te.launchUrl();
		
		
	}
}
