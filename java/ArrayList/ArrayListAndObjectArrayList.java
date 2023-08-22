package ArrayList;

import java.util.ArrayList;

public class ArrayListAndObjectArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> empCount = new ArrayList<Integer>();
		
		empCount.add(101);
		empCount.add(102);
		empCount.add(103);
		empCount.add(104);
		
		System.out.println(empCount.size());
		
		for(int i = 0;i<empCount.size();i++)
		{
			System.out.println(empCount.get(i));
		}
		
		
//		Object Array list
		
		ArrayList<Object> empImfo = new ArrayList<Object>();
		
		empImfo.add("Pooja");
		empImfo.add("Female");
		empImfo.add(27);
		
		for(int i = 0;i<empImfo.size();i++)
		{
			System.out.println(empImfo.get(i));
		}
		
		
		
		
	}

}
