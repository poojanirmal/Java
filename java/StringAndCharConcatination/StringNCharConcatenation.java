package StringAndCharConcatination;

public class StringNCharConcatenation {
	
public static void main(String[] args) {
	
//	+ plus operator in numeric calculation but in string it is concatenation
//	- minus operation
//	/ divide operator
//	* multiplication operator
//	% percent operator
//	= use to assigning the value
	
	
	int i = 100;     float t = 12.33f;
	int p = 200;     char c = 'w'; //Askii value
	String z = "300"; char y = 'a';//Askii Value
	String x = "400"; String s = "Pooja";
	
	System.out.println(i+p); //300
	
	System.out.println(i+p+z); //600300
	
	System.out.println(z+i+t); //after string calculation it should be string not doing any numeric calculation
	
	System.out.println(t+p+y+z); //12.33+200+(a askii value)+300 as a string
	
	System.out.println(x+c); //after string char itself instead of askii value
	
	System.out.println(s+i+p+t+y);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
