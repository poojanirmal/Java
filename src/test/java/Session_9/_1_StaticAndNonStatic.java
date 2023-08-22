package Session_9;

public class _1_StaticAndNonStatic {
	
	String name;
	static int age = 25;
	
	public void getName()
	{
		System.out.println("get name");
	}
	
	public static void getStart()
	{
		System.out.println("getStart");
	}
	
	public static void main(String[] args) {
		
		_1_StaticAndNonStatic obj = new _1_StaticAndNonStatic();
		
//		Calling static data member directly without creating an object - method AND variable this is data member(this is proper way)
		
		getStart();
		System.out.println(age);
		
//		Calling static member by using class name
		
		_1_StaticAndNonStatic.getStart();
		
		System.out.println(_1_StaticAndNonStatic.age);
		
//	Can i access static member by using object referenced 	
		
		obj.getStart();
		System.out.println(obj.age);
		
		
//		Calling non static data member by creating an object
		
	     obj.getName();
		 obj.name = "Pooja";
		System.out.println(obj.name);

//		Can i create object without any referenced?
//		non static
		new _1_StaticAndNonStatic().getName();
		System.out.println(new _1_StaticAndNonStatic().name = "Rahul");
		
//		static
		new _1_StaticAndNonStatic().getStart();
		
		System.out.println(new _1_StaticAndNonStatic().name = "Nirmal");
		
		
		
//		Creating an object and making its referenced null
	
//		obj = null;
//		
//		obj.getName();
		
//		or creating another object
		
		_1_StaticAndNonStatic obj1 = new _1_StaticAndNonStatic();
		
		obj1 = null;
		
		obj1.getName();// this line will show java.lang.NullpointerException
		
		
	}
	
	
}
