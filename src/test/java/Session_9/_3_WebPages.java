package Session_9;

public class _3_WebPages {
	
//	data member of the class - class variable and class method
	
	String title;
	String url;
	String header;
	static String logo = "http://WWW.aws3.amazon.com";
	
	public void topPannel()
	{
		System.out.println("Top Pannel");
	}
	
	public void centerPannel()
	{
		System.out.println("Center Pannel");
	}
	
	public void footerLinkPannel()
	{
		System.out.println("Footer Link Pannel");
	}
	
	public static void privacyPolicy()
	{
		System.out.println("privacy policy");
	}
	
	public static void main(String[] args) {
	
		_3_WebPages p1 = new _3_WebPages();	
		_3_WebPages p2 = new _3_WebPages();	
		_3_WebPages p3 = new _3_WebPages();	
		
		
//		Assigning the value for login page
		p1.title = "Login page";
		p1.header = "Login to App";
		p1.url = "http://abc.com/login";
		
		System.out.println("............Web page for Login...........");
		System.out.println(p1.title + " , "+p1.header + " , " +p1.url + " , ");
		p1.topPannel();
		p1.centerPannel();
		p1.footerLinkPannel();
		_3_WebPages.privacyPolicy();
		
		System.out.println("Logo -> "+_3_WebPages.logo);
		System.out.println("........................................");
		
		
//		Assigning the value for home page
		p2.title = "Home page";
		p2.header = "Welcome to Home Page";
		p2.url = "http://abc.com/home";
		
		System.out.println("............Web Home Page...........");
		System.out.println(p2.title + " , "+p2.header + " , " +p2.url + " , ");
		p2.topPannel();
		p2.centerPannel();
		p2.footerLinkPannel();
		_3_WebPages.privacyPolicy();
		
		System.out.println("Logo -> "+_3_WebPages.logo);
		System.out.println("........................................");
		
		_3_WebPages.privacyPolicy();
		
		System.out.println("........................................");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
