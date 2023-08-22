package AccessModifier.OutsidePackage;

import AccessModifier.ChildClass;

public class _2_ChildClass extends ChildClass {
	
//	for public
	public String changeName()
	{
		name = "swara";
		return name;
	}
	
//	for protected
	public String changeHusbandName()// Allowed outside the package child class
	{
		husbandName = "Devansh";
		return husbandName;
	}
	
	
//	for private
//	public int changeAge()
//	{
//		age = 28;
//		return age;
//	}
	
//	for default
//	public String changeGender()
//	{
//		gender = "Male";
//		return gender;
//	}
	
	public static void main(String[] args) {
		
		_2_ChildClass cc =	new _2_ChildClass();
		
		
		System.out.println(cc.changeName());
		
		System.out.println(cc.changeHusbandName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
