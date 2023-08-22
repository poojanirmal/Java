package ConstructorAndOverloading;

public class Constructor {
String name;
int n;
	public Constructor()
	{
		System.out.println("pass some value");
	}
	public Constructor(String name,int n)
	{
		this.name = name;
		this.n = n;
	}
	
	public Constructor(String name)
	{
		this.name = name;
		
	}
	
	//another way of calling the constructor for that create the method
	
	public void allVariable()
	{
		System.out.println(name+" , "+n);
	}
	public void oneVariable()
	{
		System.out.println(name);
	}
	
	
	
	
	public static void main(String[] args) {
		Constructor ref = new Constructor();
		Constructor ref1 = new Constructor("pooja",100);
		//System.out.println(ref1.name+ref1.n);we call constructor like this
		Constructor ref2 = new Constructor("Rahul");
//		System.out.println(ref.name+" , "+ref.n);
		
//		ref1.allVariable();//we call like this to save multiple line 
//		ref2.oneVariable();
//		
		System.out.println(ref1.n+" , "+ref1.name);
		
		System.out.println(ref2.name);
		
		
		
		
		
	}
	
	
	
	
	
	
}
