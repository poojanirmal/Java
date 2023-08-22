package Session_13;

public class _3_Test {
	
	public static void main(String args[]){
		
		_2_LoginPage lg = new _2_LoginPage();
		
		lg.title();
		lg.url();
		lg.footerLink();
		lg.logo();
		lg.privacyPolicy();
		lg.doLogin();
		
		System.out.println("...............................");
//		Top Casting
		
		_1_Page pg = new _2_LoginPage();
		
		pg.url();
		pg.title();
		pg.footerLink();
		pg.privacyPolicy();
		pg.logo();
//		pg.doLogin();
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}