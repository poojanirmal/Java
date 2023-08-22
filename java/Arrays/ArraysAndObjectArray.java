package Arrays;

public class ArraysAndObjectArray {
	
	
	public static void main(String[] args) {
		
		
		int tableOfEleven[] = new int[4];
		
		tableOfEleven[0] = 11;
		
		tableOfEleven[1] = 22;
		
		tableOfEleven[2] = 33;
		
		tableOfEleven[3] = 44;
		
		System.out.println(tableOfEleven.length);
		
		for(int i = 0;i<tableOfEleven.length;i++)
		{
			System.out.println(tableOfEleven[i]);
		}
		
		System.out.println("..................................................");
		
//		object arrays
		
		Object emp[] = new Object[4];
		
		emp[0] = "Pooja";
		emp[1] = "Female";
		emp[2] = 27;
		emp[3] = "Rahul";
		
		for(int i = 0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
//		System.out.println(emp.equals("Pooja"));
		
	}

}
