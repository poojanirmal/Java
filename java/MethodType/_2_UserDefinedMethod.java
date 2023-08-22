package MethodType;

import java.util.ArrayList;

public class _2_UserDefinedMethod {
	
//	no input no return
	
	public void test() 
	{
		System.out.println("This is the test method");
	}
	
//	no input some return
//	Ex.1
	public String countryName()
	{
		String name = "india";
		System.out.println("This is the name of country -> ");
		return name;
		
	}
	
//	Ex.2
	public ArrayList<Integer> tableOfEleven()
	{
		ArrayList<Integer> tableOfEleven = new ArrayList<Integer>(); 
		tableOfEleven.add(11);
		tableOfEleven.add(22);
		tableOfEleven.add(33);
		tableOfEleven.add(44);
		tableOfEleven.add(55);
		return tableOfEleven;
		
		
	}
	
	
//	some input some return
//	Ex.1
	public int Add(int a,int b)
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
			System.out.println("This is the name of factory -> ");
			return fact1;
		}
		else if(nameOfFactory.equals("puma"))
		{
			String fact2 = "puma";
			System.out.println("This is the name of factory -> ");
			return fact2;
		}
		return "No factory found";
		
	}
	
//	Ex.3
	
	public String countryCapital(String nameOfCountry)
	{
		if(nameOfCountry.equals("india")) 
		{
			return "new Delhi";
		}
		else if(nameOfCountry.equals("usa"))
		{
			return "Washington DC";
		}
		return "No country found";
	}
	
//  Calling above method
	
	public static void main(String[] args) {
		
		_2_UserDefinedMethod userDefinedMethod = new _2_UserDefinedMethod();
//		Calling test method
		userDefinedMethod.test();
		
//	Calling countryName method
		userDefinedMethod.countryName();
		System.out.println(userDefinedMethod.countryName());
		
// Calling tableOfEleven method
		ArrayList<Integer> table = userDefinedMethod.tableOfEleven();
		for(int i = 0;i<table.size();i++)
		{
			System.out.println(table.get(i));
		}
		
//	Calling	Add method
		
		userDefinedMethod.Add(50,60);
		
		System.out.println("This is the addition of number"+" "+userDefinedMethod.Add(50,60));
		
//	Calling factoryName method
		
		String factory = userDefinedMethod.factoryName("nike");
		System.out.println(factory);
		
//	Calling countryCApital method
		
		String country = userDefinedMethod.countryCapital("india");
		System.out.println("This is the capital name ->"+" "+country);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
