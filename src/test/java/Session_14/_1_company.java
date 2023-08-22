package Session_14;

public class _1_company {
	
//	Access modifier - public - inside and also outside the package
//                    private - specific class
//	                  protected - class ,same package and sub class outside the package
//	                  default - specific package
	
	public int empCount = 300;
	private int revenue = 500000;
	protected String ceoName = "Mr.Thomas";
	String companyBranchName = "Unicorn System Berlin";
	
	public static void main(String[] args) {
		
		_1_company comp = new _1_company();
		
	System.out.println(comp.empCount);
	System.out.println(comp.ceoName);	
	System.out.println(comp.companyBranchName);	
	System.out.println(comp.revenue);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
