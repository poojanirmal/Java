package ExceptionHandling;

public class _4_ThrowException {
	
	
	public static void main(String[] args) {
		
	
		String userName = "Rahul";
		
		if(userName == "Rahul" || userName == "Suman")
		{
			try
			{
				throw new Exception("UserDefinedException");
//				System.out.println("This is the user name -> "+userName);
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
		
		
		
		
		
		
		
		
	}
	
	
}
