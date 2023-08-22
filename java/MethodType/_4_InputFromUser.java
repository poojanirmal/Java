package MethodType;

import java.util.Scanner;

public class _4_InputFromUser {
	public static void main(String args[]) {
		
		_2_UserDefinedMethod userDefinedMethod = new _2_UserDefinedMethod();
		
		System.out.println("please enter the number");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		
		
		int totalOfNumber = userDefinedMethod.Add(i,p);
		
		System.out.println(totalOfNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
