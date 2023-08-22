package Session_15;

public class _5_Throw {
//  throw keyword is used to ceate custom exception by user
//	as java has not included all kind of exceptions
//	and there will be some cases where users need to create its own exception according to some specific condition
	
//	1.Incorrect URL exception
		public static void launchURL(String url)
		{
			if(url.equals(" "))
			{
				try
				{
					throw new Exception("incorrectException");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("The enter url value is incorrect..");
				}
			}
			else
			{
				System.out.println("Launching the url ->"+url);
			}
		}
	
	
	
	
	public static void main(String[] args) {
//		use case
//		2. while reading data from any excel sheet the cell value gets empty or null
		
		String userName = " ";//null;
		
		if(userName.equals(" ") || userName.equals(null))
		{
			try
			{
				throw new Exception("UserDefinedException");

			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception handled");
			}
			
		}
		
		else
		{
			System.out.println("This is the user name -> "+userName);
		}
		
		
		 _5_Throw.launchURL("https//WWW.test.com");
		
		
		
		
		
	}
}
