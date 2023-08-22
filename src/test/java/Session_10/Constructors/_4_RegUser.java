package Session_10.Constructors;

public class _4_RegUser {
	
	public static void main(String[] args) {
		
	
		 _3_Reg reg = new  _3_Reg();
	
	
//	Registering user with only mandatory
	
	 _3_Reg reg1 = new  _3_Reg("Harry","joe",101,"harryjoe@test.com","123@Abc");
	
	
//	registering with all field
	
	 _3_Reg reg2 = new  _3_Reg("john","mathew",102,"johnmathew@test.com","123@Abc","18","Hollywood awe","LA","01-01-1997",true,987);
	
	
	System.out.println(".......................................................................");
	
	reg1.doRegistrationWithMandatoryFields();
	
	System.out.println(".......................................................................");
	
	reg2.doRegistrationWithAllfield();
	
	System.out.println(".......................................................................");
	
	
	
	
	
	
	
	
	
	
	}	

}
