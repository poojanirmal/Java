package Session_7;

public class _1_DefaultValues {
	
//	static variables
	
	public static String str;//str,i,f,.....all are global variable
	public static int i;
	public static float f;
	public static boolean b;
	public static double d;
	public static long l;
	public static char c;
	public static byte e;
	
	public static void main(String[] args) {
		
	System.out.println(str);	
	System.out.println(i);
	System.out.println(f);
	System.out.println(b);
	System.out.println(d);
	System.out.println(l);
	System.out.println(c);
	System.out.println(e);
	
		
//	int p; this is local variable need to initialized the value
//	System.out.println(p);  
	
	int q = 12;
	
	System.out.println(q);  	
		
	int k = 9/3;
	System.out.println(k);
		
	int m = 0/9;
	System.out.println(m);
		
//	int n = 9/0;  This is arithmetic exception - something or entire calculation divide by zero then arithmetic exception will come.
//	System.out.println(n);  
	
	
	}
	
	
}
