package session_2;

public class _1_StringAndCharConcatenation {
	public static void main(String[] args) 
	{
		
	//	+ plus operator in numeric calculation and concatenation in string and character calculation
		
		// string concatenation
		
		String x = "Test";
		String y = "selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a);//100
		System.out.println(a+b);//300
		System.out.println(x+y);//TestSelenium
		System.out.println(a+b+x);//300Test
		System.out.println(x+y+a+b);//TestSelenium100200 //after starting the string operation output come as a string //i+i=i i+i+s=s i+s+i+i=s s+i+i+i=s
		
		// Use Case
		
		int bill = 520;
		int tax = 30;
		int total = bill+tax;
		System.out.println(total);//550
		System.out.println("food bill is " + total);//550
		System.out.println("food bill is " + bill+tax );//food bill is 52030
		System.out.println("food bill is " +(bill+tax));//food bill is 550
		
		
		// Character Concatenation
		
		char c1 = '5'; int z1 = 5;
		char c2 = '4'; int z2 = 4;
		char c3 = 'A'; String q1 = "A";
		char c4 = 'B'; String q2 ="B";
		
		System.out.println(c1+c2);//105  addition of ASCII value| each character have their own ascii value
		System.out.println(z1+z2);//9
		System.out.println(c3+c4);//132 (A=65+B=66=131)
		System.out.println(q1+q2);//AB
		System.out.println(c1+c2+c3+c4+c1+c2);//341
		System.out.println(c1+c2+q1+q2+c1+c2);//105AB54 this 54 means character not ascii value because after string operation it executed as a string 
		
			
	}

}
