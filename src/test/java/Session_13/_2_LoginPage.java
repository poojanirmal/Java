package Session_13;

public class _2_LoginPage extends _1_Page{
	
	public _2_LoginPage()
	{
		System.out.println("login page const....");
	}

	@Override
	public void title() {
		System.out.println("login page -- title");
		
	}

	@Override
	public void url() {
		System.out.println("login page -- url");
		
	}

	@Override
	public void footerLink() {
		System.out.println("login page -- footerlink");
		
	}	
//    public void privacyPolicy()  not override the final method
//	{
//		System.out.println("page -- privacy policy");
//	}
		
	@Override	
	public void logo()
	{
		System.out.println("login page -- logo");
	}	
		
//		special method
	public void doLogin()
	{
		System.out.println("login to page...");
	}
		
	

}
