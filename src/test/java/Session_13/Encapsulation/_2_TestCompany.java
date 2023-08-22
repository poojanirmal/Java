package Session_13.Encapsulation;

public class _2_TestCompany {
	public static void main(String[] args) {
		
		_1_Company comp = new _1_Company();
		
	    System.out.println(comp.name); //default value
	    System.out.println(comp.empCount); //default value
	    System.out.println(comp.logo);	//default value
//		System.out.println(comp.searchEngine);	private not access in different class
//		System.out.println(comp.revenue);
		
	    comp.setName("Alphabet unicorn");
	    System.out.println(comp.name);
		System.out.println(comp.getName());
		
		comp.setEmpCount(1000);
		System.out.println(comp.empCount);
		System.out.println(comp.getEmpCount());
		
		comp.setLogo("httl//WWW.alphabet.com/logo");
		System.out.println(comp.logo);
		System.out.println(comp.getLog());
		
		comp.setSearchEngine("Google");
//		System.out.println(comp.searchEngine);
		System.out.println(comp.getSearchEngine());
		
		comp.setRevenue(100000);
//		System.out.println(comp.revenue);
		System.out.println(comp.getRevenue());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
