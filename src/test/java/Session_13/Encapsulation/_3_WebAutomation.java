package Session_13.Encapsulation;

public class _3_WebAutomation {
	
//	This is chain reaction
	
	public void launchBrowser()
	{
		interactWithBrowser();
	}
	
	private void interactWithBrowser()
	{
		checkBrowserCompatability();
	}
	
	private void checkBrowserCompatability()
	{
		checkBrowserVersion();
	}
	
	private void checkBrowserVersion()
	{
		checkBrowserWithOS();
	}
	
	private void checkBrowserWithOS()
	{
		System.out.println("Launch the Browser.......");
	}
	
	
	
	
	
	
	
	

}
