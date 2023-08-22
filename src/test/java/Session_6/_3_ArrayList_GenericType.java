package Session_6;

import java.util.ArrayList;

public class _3_ArrayList_GenericType {
	
	
	public static void main(String[] args) {
		
		
//		Generic Type -  to stored value of particular data type
		
//		String type Array list

      ArrayList<String> usernames = new ArrayList<String>();
		
      usernames.add("Tom");
      usernames.add("Pooja");
      usernames.add("Rahul");
      
      for(int i = 0; i<usernames.size();i++) 
      {
    	 System.out.println(usernames.get(i)); 
      }
      
//		Integer type Array list
      
      ArrayList<Integer> markList = new ArrayList<Integer>();
      
      markList.add(16);
      markList.add(17);
      markList.add(19);
      markList.add(20);
      
      for(int z = 0; z<markList.size();z++) 
      {
    	  System.out.println(markList.get(z));
      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
