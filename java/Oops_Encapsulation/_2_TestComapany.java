package Oops_Encapsulation;

public class _2_TestComapany {
	
	
	public static void main(String[] args) {
		
		_1_Company comp = new _1_Company();
		
		System.out.println(comp.name);
		System.out.println(comp.empCount);
//		System.out.println(comp.ceoName);
//		System.out.println(comp.revenue);
		
		comp.setName("Accenture");
		System.out.println(comp.name);
//		System.out.println(comp.setName("Accenture"));
		System.out.println(comp.getName());
		
		comp.setEmpCount(1000);
		System.out.println(comp.empCount);
		System.out.println(comp.getEmpCount());
		
		comp.setCeoName("Mrs.Pooja");
//		System.out.println(comp.ceoName);
		System.out.println(comp.getCeoName());
		
		comp.setRevenue(2000);
//		System.out.println(comp.revenue);
		System.out.println(comp.getRevenue());
		
	}

}
