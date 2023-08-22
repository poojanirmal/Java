package Oops.Inheritance;

public class _4_TestFamily {
	
	
	public static void main(String[] args) {
		
		_2_YoungerFamily yf = new _2_YoungerFamily();	
		
		yf.grandFather();
		yf.grandMother();
		yf.father();
		yf.mother();
		yf.brother();
		yf.me();
		yf.husband();
		yf.familyMember();
		_2_YoungerFamily.familyInformation();
		System.out.println("...........................................");
//		Top casting
		
		 _1_ElderFamily ef = new _2_YoungerFamily();
		ef.familyMember();
		ef.father();
		ef.grandFather();
		ef.grandMother();
		ef.mother();
		_1_ElderFamily.familyInformation();
		
//		 _1_ElderFamily ef2 = new _2_YoungerFamily();
		
		
//		Down casting
		
//		 _2_YoungerFamily yf1 = new _1_ElderFamily();
		
		
		
	}
	

}
