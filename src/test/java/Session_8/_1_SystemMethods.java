package Session_8;
import java.util.ArrayList;
public class _1_SystemMethods {
	
	static String WelcomeMsg ="Hello User Welcome";
	
	
	public static void main(String[] args) {
		
		System.out.println(WelcomeMsg.length());
		
		System.out.println(WelcomeMsg.trim());
		
		ArrayList<Integer> tableOfEleven = new ArrayList<Integer>();
		
		tableOfEleven.add(11);
		tableOfEleven.add(22);
		tableOfEleven.add(33);
		tableOfEleven.add(44);
		tableOfEleven.add(55);
		
		for(int i = 0; i<tableOfEleven.size();i++) 
		{
		System.out.println(tableOfEleven.get(i));	
		}
		
		tableOfEleven.remove(1);
		
		
		for(int i = 0; i<tableOfEleven.size();i++) 
		{
		System.out.println(tableOfEleven.get(i));	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
