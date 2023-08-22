package Session_14.FinalKeyword;

class Parent{
	
	final public void test()
	{
		System.out.println("This is the test method of parent class");
	}
	
	public void test1()
	{
		System.out.println("This is the test1 method of parent class");
	}
}

public class _2_FinalKeywordMethod extends Parent {
	
//	@Override
//	 public void test()
//	{
//		System.out.println("This is the test method of child class");
//	}

	@Override
	public void test1()
	{
		System.out.println("This is the test1 method of child class");
	}

	public static void main(String[] args) {
		
		
		_2_FinalKeywordMethod fk = new _2_FinalKeywordMethod();
		
		
		fk.test();
		fk.test1();
		
		
		
		
		
	}
		
	
	
}
