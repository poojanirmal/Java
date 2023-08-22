package FinalKeyword;

class A{
	
	public void test1()
	{
		System.out.println("this is test1 method of A clas");
	}
	
	 final public void test2()  // final method are not allowed to override
	{
		System.out.println("this is test2 method of A class");
	}
	
}

public class _2_FinalMethod extends A{
	
	@Override
	public void test1()
	{
		System.out.println("this is test1 method of A clas");
	}
	
//	 final public void test2()
//	{
//		System.out.println("this is test2 method of A class");
//	}
	
	public static void main(String[] args) {
		
		_2_FinalMethod fm =	new _2_FinalMethod();
	
		fm.test1();
		fm.test2();
		
		
		
		
		
		
	} 
}
