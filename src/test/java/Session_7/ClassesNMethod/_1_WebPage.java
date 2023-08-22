package Session_7.ClassesNMethod;

public class _1_WebPage {
	
//	class - 1.All the code we write in java is inside classes.
//	2.It is a template where we write logical code.
	
//	Object - 1.it is an entity that is comes from class.
//	2.and when we create an object of this class we will have all the data member with each object.
	
//	data member - it means variable and method
	
//	class implementation
	
//	non static variable
	String title = "Welcome to best Goods";
	String url = "https://WWW.bestgoods.com";
	String header = "best goods.com: Online shopping- Buy mobiles,laptop,cameras,books";
	String logoImage = "https:WWW,bestgoods.com/images/logo";
	
//	static variable
	static String loginMenu ="This is Login menu";
	
	
//	Non static method - for non static method and variable we need to create an object in main method
	
	public void topPannel () 
	{
//		logic
		
		System.out.println("...................topPannel start...............");
		System.out.println(url);
		System.out.println("This is a top pannel of the webpage");
		System.out.println(title);
		System.out.println(logoImage);
		System.out.println("....................topPannel end.................");
	}

	
	public void footerLinks ()
	{
//		logic
		
		System.out.println("...................footerLinks Pannel start...............");
		System.out.println("footer Link 1");
		System.out.println("footer Link 2");
		System.out.println("footer Link 3");
		System.out.println("...................footerLink Pannel ends...................");
		
	}
	
	public void centerPannel () 
	{
//        logic
		
		System.out.println("...................centerPannel start...............");
		System.out.println("mobile");
		System.out.println("laptop");
		System.out.println("books");
		System.out.println("cameras");
		System.out.println("....................centerPannel end.................");
		
		
	}
	
	
//	static method - for  static method and variable we don't need to create an object in main method.we directly print it
	
	
	public static void privacyPolicy () 
	{
		
//        logic
		
		System.out.println("...................privacyPolicy start...............");
		System.out.println("about best good business");
		System.out.println("best goods vendors");
		System.out.println("privacy notes");
		System.out.println("....................privacyPolicy end.................");
			
		
	}
	
	public static void main(String[] args) 
	{
		
		_1_WebPage xc = new _1_WebPage ();//this is an object of this class
		
		xc.topPannel();
		xc.footerLinks();
		xc.centerPannel();
		privacyPolicy();//no need to used object referenced name because it is static method.
		
		System.out.println(xc.title);//to print the non static variable write it in print statement with object reff. name.
		System.out.println(xc.logoImage);
		System.out.println(loginMenu);//no need to used referenced name because it is static variable.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
