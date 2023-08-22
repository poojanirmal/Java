package Session_3;

public class _1_ConditonalOperators 
{
	public static void main(String[] args) 
	{
		// == equal to
		// > greater than
		// < smaller than
		// >= greater than equal to
		// <= smaller tan equal to
		// != not equal to
		// && and operator also called short circuit operator
		// || or operator
		
		int a = 100;
		int b = 200;
		// compare which number is greater
		
		if(a>b) 
		{
			System.out.println("a is greater than b");
			
		}
		else // optional part not necessary to write every time
		{
			System.out.println("b is greater than a");
			
		}
			
		// above case not clearly give the console that is the number equal or less so for that below case use
		
		if(b == a)
		{
			
			System.out.println("both values are equal");	
		}
		else if(b>a)
		{
			System.out.println("b is greater than a");
			
		}
		
		else
		{
		System.out.println("b is less than a");
		
	    }
		
		// compare which one is greater 
		//or two are equal
		
		if(a >= b) 
		{
			System.out.println("a is greater than b or equal to b");
		}
		
		else
		{
		System.out.println("a is less than b");	
		}
		
		
		
		
		// Nested if
		
		int h = 15;
		
		if(h > 10)
		{ 
			if(h == 15) 
			{
				System.out.println("number is 15");
			}
		if(h == 17) 
		{
			System.out.println("number is 17");
		}
		
		}
		else 
		{
			System.out.println("number is not found");
		}
		
		//Nested if - else if
		
		int num = 10;// 10 20 30 
		
				if(num == 10) 
				{
					System.out.println("The number is 10");
				}
				else if(num == 20)
				{
					System.out.println("The number is 20");
				}
				else if(num == 30)
				{
					System.out.println("The number is 30");
				}
				
				else 
				{
					System.out.println("The number is not found");
				}
				
				
				
				
		// != operator
		
		int bill = 100;
		if(!(bill == 0)) 
		{
		System.out.println("you are eligible for 10% discount");
			
		}
		else 
		{
		System.out.println("you are not eligible for discount");	
		}
		
		// || operator
		
		//T T = T
		//F T = T
		//T F = T
		//F F = F
		
		String username = "Tom";
		
		if( username == "jeff"|| username == "peter")
		{
			System.out.println("Hi there " + username);
			System.out.println("How may i help you");
		}
		else if(username == "pooja"|| username == "rahul")
		{
			System.out.println("Hi there " + username);
			System.out.println("How may i help you");
			
		}
		else 
		{
		System.out.println("Hi there " + username);
		System.out.println("How may i help you");
		}
		
		// && operator
		
		// T T = T
		//T F = F
		//F T = F
		//F F = F
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		//WAP to find highest number from 3 numbers
		
		if(x>y && x>z) 
		{
		System.out.println("x is greater number");	
			
		}
		else if(y>z)
		{
			System.out.println("y is greater number");
		}
			
		else 
		{
		System.out.println("z is greater number");	
		}
		
		
		// Dead Code - A part of code which will not executed any time
		// even though its syntactically correct
		
		// If statement need always a true condition to execute the code
		//try for not equal to operator
		if(false) 
		{
			System.out.println("Hello everyone");//apn adhich false  mhanun jr deside kell tr system te true asun pn output nahi det
		}
		
		else 
		{
		System.out.println("Good bye");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
