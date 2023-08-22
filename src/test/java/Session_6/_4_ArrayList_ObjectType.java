package Session_6;

import java.util.ArrayList;

public class _4_ArrayList_ObjectType {
	
	public static void main(String[] args) {
		
		
//		Object type Array list - it is stored multiple value of different type of data
		
		ArrayList<Object> empInfo = new ArrayList<Object>();
		
		empInfo.add("Pooja");
		empInfo.add('M');
		empInfo.add(499.99);
		
		for(int i = 0; i<empInfo.size(); i++) 
		{
			System.out.println(empInfo.get(i));
		}
		
		
//	clear or delete everything - in print statement use .size()
		
		empInfo.clear();
		
		System.out.println(empInfo.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
