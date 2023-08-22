package AccessModifier.OutsidePackage;

import AccessModifier.ChildClass;

public class _1_ParentClass {
	
	public static void main(String[] args) {
		
		
        ChildClass cc = new ChildClass();
		
		System.out.println(cc.name);
		
//		System.out.println(cc.age);    private not allowed to access in different class
		
//		System.out.println(cc.husbandName); protected not allowed outside the package
//		
//		System.out.println(cc.gender);      default not allowed outside the package
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
