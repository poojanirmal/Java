package Session_6;

import java.util.ArrayList;

public class _2_ArrayList_RawType {
	
	public static void main(String[] args) {
		
//		Array List Raw Type - we stored any type of data in raw type.
//		Array list increase its length and create its own space
//		no restriction to add or remove value of any type of data
//		no need to increase the capacity of array list it automatically increase
		
//		How to count size of array list
		
	   ArrayList ar = new ArrayList();
		
    	System.out.println(ar.size());
		
		int i = ar.size();
		
		
//		How to add multiple values
		
		ar.add(100);
		
		ar.add(200);
		
		ar.add("test");
		
		ar.add(300);
		
		ar.add(400);
		
		
		System.out.println(ar.size());
		
//	How to find value at specific index value
		
		System.out.println(ar.get(2));
		
		
//		for printing all value over console
		
		for(int j = 0; j<ar.size();j++) 
		{
			System.out.println(ar.get(j));
		}
		
		
//		How to remove something value - .remove() method
		
		ar.remove(2);
		
		for(int k = 0; k<ar.size();k++)
		{
			System.out.println(ar.get(k));
		}
		
		
//		How to find index position of particular value
		
		for(int m = 0; m<ar.size();m++)
		{
			if(ar.get(m).equals("test"))
			{
				System.out.println("At Index No."+ m + ". "+ ar.get(m));	
				
			}
			
		}
		
			
		
		
	}

}
