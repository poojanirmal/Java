package Session_7.ClassesNMethod;

public class _2_WebPageExecution 
{
// class Execution
	
	public static void main (String[] args) 
	{
		
	_1_WebPage objRef =	new _1_WebPage (); 
	
//	Calling non static methods from _1_WebPageclass for execution of the logic
	
	objRef.topPannel();
	objRef.footerLinks();	
	objRef.centerPannel();	
		
//	Calling static methods from _1_WebPageclass for execution of the logic
		
		
	_1_WebPage.privacyPolicy();// we execute this in another class so we need to used class name where it implement or initialized	
		
		
			
		
	}

}
