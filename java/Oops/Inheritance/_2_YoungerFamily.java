package Oops.Inheritance;

public class _2_YoungerFamily extends _1_ElderFamily {

	public void brother()
	{
		System.out.println("Name - Akshay Ghare");
	}
	
	public void me()
	{
		System.out.println("Name - Pooja Nirmal");
	}
	
	public void husband()
	{
		System.out.println("Name - Rahul Nirmal");
	}
	
	@Override
	public void familyMember()
	{
		System.out.println("Total family member");
	}
	
	public static void familyInformation()//static method not override
	{
		System.out.println("Family information");
	}
	
	
}
