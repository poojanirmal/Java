package FinalKeyword;

final class B {
	
	public void test()
	{
		System.out.println("This is the test method of B class");
	}
}


public class _3_FinalClass{ //extends B     

	public static void main(String[] args) {
		
//		_3_FinalClass fc = new _3_FinalClass();
		
		B fc = new B();
		
		
		fc.test();
	}
	
		
}
