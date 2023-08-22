package Session_10.Constructors;

public class _1_Employee {

	
	String name;
	int age;
	String dept;
	int empId;
	
	static String compName = "Unicorn System";
	
	
	public static void main(String args[]) {
		
		
//		assigning the value to instance variable to the different object
		
		_1_Employee e1 = new _1_Employee();
		
		e1.name = "Tom";
		e1.age = 25;
		e1.dept = "QA";
		e1.empId = 101;
		
		_1_Employee e2 = new _1_Employee();
		
		e2.name = "steve";
		e2.age = 27;
		e2.dept = "HR";
		e2.empId = 102;
		
		System.out.println("Employee e1 detailed");
		
		System.out.println("NAme: "+e1.name);
		System.out.println("Age: "+e1.age); 
		System.out.println("Dept: "+e1.dept);
		System.out.println("Empt Id: "+e1.empId);
		
		System.out.println("..................................");
		
		
         System.out.println("Employee e2 detailed");
		
		System.out.println("NAme: "+e2.name);
		System.out.println("Age: "+e2.age); 
		System.out.println("Dept: "+e2.dept);
		System.out.println("Empt Id: "+e2.empId);
		
		System.out.println("..................................");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}



