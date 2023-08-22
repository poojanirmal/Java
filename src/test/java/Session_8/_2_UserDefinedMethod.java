package Session_8;

public class _2_UserDefinedMethod {
	
	
	
//	no input no return
	public void test() 
	{
		System.out.println("Test Method");
	}
	
//	no input some return
//	Ex.1
	public String nameOfCountry()
	{
	   String country = "india";
	  
	   return country; //for return the value you have to change the void as return type(string.string[].....	
	}
	
// Ex.2
	
	public String[] nameOfStudent() 
	{
		System.out.println("Student List - ");
		String name[]= new String[3];
		name[0] = "pooja";
		name[1] = "Rahul";
		name[2] = "Nirmal";
		return name;
		
		
	}
	
//	some input some return
//	Ex.1
	public int add(int a,int b) 
	{
		int c = a+b;
		return c;
	}
	
//	Ex.2
	
	public String factoryName(String nameOfFactory) 
	{
		
		if(nameOfFactory.equals("nike")) 
		{
			String fact1 = "nike";
			System.out.println("This is nike factory");
			return fact1;
		}
		
		else if(nameOfFactory.equals("puma")) 
		{
			String fact2 = "puma";
			System.out.println("This is puma factory");
			return fact2;
		}
		
		return "no factory withing the criteria found";
		
		
	}
	
//	Ex.3
	
	public String countryCapital(String nameOfCapital) 
	{
	if(nameOfCapital.equals("india")) 
	{
		return "New Delhi";
	}
	if(nameOfCapital.equals("usa"))	
	{
		return "Washington DC";
	}
	else 
	{
	    return "No capital found";	
	}
		
		
		
	}
	
	
//	Calling above user defined method to execute the actual logic
	
	public static void main(String[] args) 
	{
		 _2_UserDefinedMethod  userDefinedMethod = new  _2_UserDefinedMethod();
		 
		 userDefinedMethod.test();
		
//		Calling nameOfCountry method
		 
		String countryName = userDefinedMethod.nameOfCountry();
		System.out.println("This is the county name ->"+" "+countryName );
//		Another way
//		System.out.println("This is the county name ->"+" "+userDefinedMethod.nameOfCountry());
		
//		 Calling nameOfStudent method
		 
		String[] student =  userDefinedMethod.nameOfStudent();
		
		for(int i =0;i<student.length;i++) 
		{
			System.out.println(student[i] );
		}
		
//		Calling add method
		
//		userDefinedMethod.add(10,30);
//		System.out.println(userDefinedMethod.add(10,30));
		
		// Another way
		int total = userDefinedMethod.add(10,30);
		System.out.println(total);

//		Calling factoryName
//		userDefinedMethod.factoryName("puma");
//		System.out.println(userDefinedMethod.factoryName("puma"));

//        Another way
		String fact = userDefinedMethod.factoryName("puma");
		System.out.println(fact);
		
		
//		Calling countryCapital method
		
//		userDefinedMethod.countryCapital("india");
//		System.out.println(userDefinedMethod.countryCapital("india"));
		
//		Another way
		
		String cap = userDefinedMethod.countryCapital("india");
		System.out.println(cap);
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
