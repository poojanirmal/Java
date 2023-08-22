package HashMap;

import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _1_HashMap {  // class map nat HashMap it something diff
	
	public static void main(String[] args) {
		
	   Map<String,Integer> marks = new HashMap<String,Integer>();
	   
	   
	
//		HashMap<String,Integer> marks = new HashMap<String,Integer>();
		
		marks.put("Math", 100);
		marks.put("Reasoning", 150);
		marks.put("English", 80);
		
		
		System.out.println(marks.size());
	
		for(Entry<String,Integer> e : marks.entrySet())
		{
			System.out.println(e.getKey()+" , "+e.getValue());
		}
		
		
		marks.replace("Math", 150);
		
		System.out.println(marks.containsKey("English"));
		
		System.out.println(marks.containsValue(150));
		
		System.out.println(marks.isEmpty());
		
		marks.remove("English", 80);
		
		
		for(Map.Entry e: marks.entrySet())
		{
			System.out.println(e.getKey()+" , "+e.getValue());
		}
		
		
		
		
		
		
		
		
	}

}
