package Session_9.Overloading;

public class _1_LoginToApp {
	
//	Method Overloading - in a class one or more than one method having the same name and different  number of parameter also sequence of parameter
//	means - The method signature should be different with a simmilar name
	
	public void login() 
	{
		
		System.out.println("login 0 parameter method");
	}
	
    public void login(String username) 
    {
    	System.out.println("login 1 parameter method");
	}
	
    public void login(int otp) 
    {
    	System.out.println("login 1 parameter method");
    }
	
	
    public void login(String username,String password) 
    {
    	System.out.println("login 2 parameter method");
    }
	
	
    public void login(long PhoneNumber,String password) 
    {
    	System.out.println("login 0 parameter method");
    	
   }

//    This is a duplicate method
//    public void login(String email_id,String password)
//    {
//    	
//    }
    
    public static void main(String[] args) {
    	
    	_1_LoginToApp i = new _1_LoginToApp();
    	
    	i.login();
        i.login(10);
    	i.login("pooja");
    	i.login(973085, "09*76");
    	i.login("Pooja", "Rahul");
    	
//    	System.out.println( new _1_LoginToApp().login());    	
//    	System.out.println(i.login("pooja"));
//    	System.out.println(i.login(973085, "09*76"));
    	
		
	}
    
      
}
    
    
    
    
    

