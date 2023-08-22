package Session_8;

import java.util.Scanner;

public class _3_InputFromUser {
	
	public static void main(String[] args) {
//		factoryName and countryCapital method
		
		
//		 System.out.println("Please enter the factory name");
//		System.out.println("Please enter the country name");// it should be before the scanner object
//		
//		Scanner sc = new Scanner(System.in);
//		String userInput = sc.next();
//		sc.close();
		
		
		_2_UserDefinedMethod  userDefinedMethod = new  _2_UserDefinedMethod();
		
//		String outputOfFactoryName = userDefinedMethod.factoryName(userInput);
//		
//		System.out.println(outputOfFactoryName);
		

		
//		String outputOfCountryCap = userDefinedMethod.countryCapital(userInput);
//		
//		System.out.println(outputOfCountryCap);
		
//		Add method
		System.out.println("Please enter the number");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int p =sc1.nextInt();
		sc1.close();
		
		
		int totalOfNumber =  userDefinedMethod.add(i,p);
		System.out.println(totalOfNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
