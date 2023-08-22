package ControlStatement;

public class SwitchCase {
	
	public static void main(String[] args) {

		// switch case is used to check multiple condition
		// In switch case string & integer are used to switch between
		//different cases
		//performance wise switch case is good than if else
		
		int number = 1;
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
			
			
		}
		
		String browser = "chrome";
		
		switch(browser)
		{
		case "chrome":
			System.out.println("chrome browser is invoked");
			break;
			
		case "firefox":
			System.out.println("firefox browser is invoked");
			break;
			
		case "safari":
			System.out.println("safari browser is invoked");
			break;
			
			default:
				System.out.println("no such browser found");
				break;
		
		
		}
		
//	switch case without break
		
		int p = 1;
		
		switch(p)
		{
		case 0:
	     case 1:
			System.out.println("Hello");
		
		case 2:
		case 3:
		case 4:
			System.out.println("Hii");
		break;
		
		default:
			break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
