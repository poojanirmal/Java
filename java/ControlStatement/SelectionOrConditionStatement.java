package ControlStatement;

public class SelectionOrConditionStatement {
	
	public static void main(String[] args) {
		
//	<  less than operator
//	>   greater than
//	<= less than equal to
//	>= greater than equal to
//	== equal to
//	!= not equal to	
//	|| or operator
//	&& and operator	
		
//		if-else statement
		
		int i = 10;
		
		if(i<10)
		{
			System.out.println("number is less than 10");
		}
		else
		{
			System.out.println("number greater than 10");
		}
		
		
		int p = 10;
		
		if(p<10)
		{
		System.out.println("number is less than 10");	
		}
		else if(p>10)
		{
			System.out.println("number is greater than 10");
		}
		else
		{
		System.out.println("number is equal to 10");	
		}
		
		
		int q = 20;
		
		if(q>=20)
		{
			System.out.println("number is greater than or equal to 20");
		}
		else
		{
			System.out.println("number is less than 20");
		}
		
//		nested if
		
		int r = 30;
		
		
		if(r < 30)
		{
			if(r == 20) 
			{
				System.out.println("number is 20");
			}
			if(r == 25)
			{
				System.out.println("number is 25");
			}
		}
		
		else
		{
			System.out.println("number not found");
		}
		
//		nested if else if
		
       int s = 30;
		
			if(s == 30) 
			{
				System.out.println("number is 30");
			}
		
		else if(s == 25)
			{
				System.out.println("number is 25");
			}
		
		
		else
		    {
			    System.out.println("number not found");
		    }
		
		
//		not equal to
			
			int bill = 300;
			
			
			if(!(bill == 0))
			{
				System.out.println("you are eligible for 10% discount");
			}
			
			else
			{
				System.out.println("you are not eligible for discount");
			}
			
			
//		|| or operator
			
//			TT = T
//			TF = T
//			FT = T
//			FF = F
			
			String username = "pooja";
			
			
			if( username =="Pooja" ||  username == "Rahul")
			{
				System.out.println("Hey user -> "+ username);
				System.out.println("welcome");
			}
			else if( username == "Suman" ||  username == "Vitthal")
			{
				System.out.println("Hey user -> "+ username);
				System.out.println("welcome");
			}
			else
			{
				System.out.println("Hey user -> "+ username);
				System.out.println("welcome");
			}
			
			
//	&& operator
			
//  TT = T
//	TF = F
//	FT = F
//	FF = F		
			int t = 100;
			int u = 200;
			int v = 300;
			
			if(t>u && t>v)
			{
				System.out.println("t is greater number");
			}
			else if(u>v)
			{
				System.out.println("u is greater number");
			}
			else
			{
				System.out.println("v is greater number");
			}
			
			
			
			
			
			
			
		
		
		
	}
	
		

}
