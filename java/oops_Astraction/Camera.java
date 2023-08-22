package oops_Astraction;

public interface Camera extends Album {
	
	public void meAndRahul();
	
	public void dishes();
	
	public void documents();
	
	public static void pic() 
	{
		System.out.println("pics");
	}
	
	
	default void images() 
	{
		System.out.println("All images");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
