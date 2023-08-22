package MethodType;

public class _1_SystemMethod {
	
	static String WelcomeMsg = "                Hello Everyone         ";
	
	public static void main(String[] args) {
		
		System.out.println(WelcomeMsg.length() );
		
		System.out.println(WelcomeMsg.trim() );
		
		String names[] = new String[3];
		
		 names[0] = "pooja";
		 names[1] = "Rahul";
		 names[2] = "nirmal";		
		
		for(int i = 0;i<names.length;i++) 
		{
			System.out.println(names[i]);
		}
		
		String b = "12.33";
		System.out.println(b+10);
		
		double d = Double.parseDouble(b);
		
		System.out.println(d+10);
		
			
		
		
	}
	
	
	
}
