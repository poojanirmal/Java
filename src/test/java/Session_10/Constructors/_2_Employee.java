package Session_10.Constructors;

public class _2_Employee {
	
	String name;
	int age;
	String dept;
	int empId;
	
	static String compName = "Unicorn System";
	
	
//	constructor is the mechanism called when an object of a class got created
//	point to be noted - 1. it has no return type
//	2.it has dame name of the class
//	3.if no constructor is provided by user java creates it.
//	4.Type of constructor - 1.Default
//	                      2.user defined(parameterized and non parameterized)
//	5.constructor can be overloaded with different parameter
	
	
	public _2_Employee()//0 parameter constructor
	{
		System.out.println("Default constructor.....");
	}
	
	public _2_Employee(int i)//1 parameter constructor
	{
		System.out.println("one prameter constructor.....");
	}
	public _2_Employee(String s)//1 parameter constructor
	{
		System.out.println("one parameter constructor.....");
	}
	
//	create parameterized constructor with all class variable initialized
	
	public _2_Employee(String name,int age,String dept,int empId)
	{
		this.name = name;
		this.age = age;
		this.dept = dept;
		 this.empId = empId;
	}
	
	
//	create parameterized constructor with only two class variable initialized
	
	public _2_Employee(String name,int empId)
	
	{
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		System.out.println("............................................");
		 _2_Employee e0 = new  _2_Employee();//0 parameter
		 
		 _2_Employee e1 = new  _2_Employee(10);//1 parameter
		 
		 _2_Employee e2 = new  _2_Employee("Pooja");//1 parameter
		 
		 
		 _2_Employee e3 = new  _2_Employee("jeff",35,"Admin",102);
		 
		 _2_Employee e4 = new  _2_Employee("Harry",36,"HR",103);
		 
		 _2_Employee e5 = new  _2_Employee("poter",37,"QA",10);
		 
		 System.out.println("............................................");
		 System.out.println(e3.name+" "+e3.age+" "+e3.dept+" "+e3.empId);
		 System.out.println(e4.name+" "+e4.age+" "+e4.dept+" "+e4.empId);
		 System.out.println(e5.name+" "+e5.age+" "+e5.dept+" "+e5.empId);
		 
		 System.out.println("............................................");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
