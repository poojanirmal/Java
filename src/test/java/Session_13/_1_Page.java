package Session_13;

public abstract class _1_Page {
//	Abstraction class
//	que - can abstract class be final
//	ans - no, a class can be either abstract or final
//	partial abstraction - 0 to100% abstraction achieved through abstraction class
//	full abstraction - 100% abstraction achieved through interface
	public _1_Page() {
		System.out.println("page const...........");
	}
	
	public abstract void title();// Abstract method /prototype
	
	public abstract void url(); // Abstract method /prototype
	
	public abstract void footerLink(); // Abstract method /prototype
	
	
//	non abstract method
	public final void privacyPolicy()
	{
		System.out.println("page -- privacy policy");
	}
	
	public void logo()
	{
		System.out.println("page -- logo");
	}
	

}
