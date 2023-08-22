package Session_11;

public class _2_BMW extends _1_Car {

	@Override   //O should be capital...this id Override method
	public void start()
	{
		System.out.println("BMW -- start");
	}
	
//	@Override
//	public void start(int a)
//	{
//		System.out.println("BMW -- start");
//	}

	public void autoParking()
	{
		System.out.println("BMW -- auto parking");
	}
	
//	static method.....static method will never override
	
	public static void carHonk()
	{
		System.out.println("car -- Honk");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
