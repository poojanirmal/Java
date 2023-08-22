package WrapperClass;

public class WrapperClass {
	public static void main(String[] args) {
		
//	Convert string to integer
		
	String s = "100";
	
	System.out.println(s+10);//10010
	
	 int i = Integer.parseInt("100");
		
		System.out.println(i+10);//110
		
		
//	Convert integer to String
		
		int p = 200;
		
		System.out.println(p+20);//220
		
		String g = String.valueOf(200);
		
		
		System.out.println(g+20);//20020
		
		
//  Convert String to double
		
		String h = "12.33";
		
		System.out.println(h+10);//12.3310
		
		double d = Double.parseDouble("12.33");
		
		System.out.println(d+10);
		
		
//	Convert String to long
		
		String n = "100000";
		
		System.out.println(n+1000);
		
		long l = Long.parseLong("100000");
		
		System.out.println(l+1000);
		
		
//	Convert String to Float
		
		String r = "22.33";
		
		System.out.println(r+10);
		
	    float f = Float.parseFloat("22.33");
		
		System.out.println(f+10);
		
		
		
		
		
		
	}

}
