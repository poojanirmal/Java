package Session_3;

public class _2_SwitchCase {
	public static void main(String[] args)
	{
	
		
		// switch case is used to check multiple condition
		// In switch case string & integer are used to switch between
		//different cases
		//performance wise switch case is good than if else
		
		
		
		int number = 5;
		switch(number)
		{
		case 0:
			System.out.println("number is zero");
			break;
			
		case 1:
			System.out.println("number is one");
			break;
			
		case 2:
			System.out.println("number is two");
			break;
			
		case 3:
			System.out.println("number is three");
			break;
		case 4:
			System.out.println("number is four");
			break;
		case 5:
			System.out.println("number is five");
			break;
			
			default:
				System.out.println("number was not found");
				
		}
		// use case - browsing switching
		
		String browser = "chrome";
		
		switch(browser) 
		{
		case"chrome":
			System.out.println("chrome is invoked");
			break;
		case "firefox":
			System.out.println("firefox is invoked");
			break;
			default:
				System.out.println("opera is not invoked");
				break;
			
			
		}
				
		// switch case without break statement
		
		int p = 1;
		
		switch(p)
		{
		case 1 :
		case 2 :
			System.out.println("Hello");
			break;
		case 3 :
		case 4 :
			System.out.println("Hi");
			break;
			default:
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
