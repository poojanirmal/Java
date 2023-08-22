package Session_14.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _1_HashMap {
	
	public static void main(String[] args) {
		
//		HashMap<String,String> credentials = new HashMap<String,String>();
		
	   Map<String,String> credentials   = new HashMap<String,String>();
		
		credentials.put("Manager", "Pooja");
		
		credentials.put("Admin", "Rahul");
		
		credentials.put("QA", "Nirmal");
		
		System.out.println(credentials.size());
		
		for(Map.Entry e : credentials.entrySet())
		{
			System.out.println("This is key -> "+e.getKey()+" , "+"This is value -> "+e.getValue());
		}
		
		credentials.replace("Manager", "Suman");
		
		System.out.println(credentials.containsKey("Admin"));
		
		System.out.println(credentials.containsValue("Rahul"));
		
		System.out.println(credentials.isEmpty());
		
		credentials.remove("QA", "Nirmal");
		
		for(Map.Entry e : credentials.entrySet())
		{
			System.out.println("This is key -> "+e.getKey()+" , "+"This is value -> "+e.getValue());
		}
		
		
		
	}
	
}
