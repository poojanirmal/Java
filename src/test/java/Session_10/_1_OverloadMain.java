package Session_10;

public class _1_OverloadMain {
	public static void main(String[] args) {
		System.out.println("This is the main method");
		main("pooja");
		main(100);
	}
	
	public static void main(int a)
	{
		System.out.println("Enter the value ->"+a);
	}
	
	public static void main(String name)
	{
		System.out.println("Enter the name ->"+name);
	}
	
		

}
