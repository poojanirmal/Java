package Session_15;

public class _6_Throws {
	
	public void launchUrl()
	{
		System.out.println("url launch..");
		openBrowser();
	}
	
	public void openBrowser()
	{
		System.out.println("Browser open..");
		loginPage();
	}
	
	public void loginPage()
	{
		System.out.println("Do login..");
		try
		{
			int i = 9/0;
			System.out.println(i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception is handled..");
		}
		

	}
	
	public static void main(String[] args) {  
		
		_6_Throws te = new _6_Throws();
           
		te.launchUrl();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
