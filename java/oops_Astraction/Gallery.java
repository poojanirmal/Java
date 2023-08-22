package oops_Astraction;

public class Gallery extends DeletedPhoto implements Camera,ScreenShot,Videos {

	@Override
	public void photo() {
		System.out.println("photo");
		
	}

	@Override
	public void birthday() {
		System.out.println("photo -- birthday");
		
	}

	@Override
	public void anniversary() {
		System.out.println("photo -- anniversary");
		
	}

	@Override
	public void StatusPhoto() {
		System.out.println("photo -- StatusPhoto");
		
	}

	@Override
	public void informative() {
		System.out.println("photo -- informative");
		
	}

	@Override
	public void meAndRahul() {
		System.out.println("photo -- meAndRahul");
		
	}

	@Override
	public void dishes() {
		System.out.println("photo -- dishes");
		
	}

	@Override
	public void documents() {
		
		System.out.println("photo -- documents");
	}
	
	
	public void downloads()
	{
		System.out.println("photo -- downloads");
	}
	
	
	public void telegram()
	{
		System.out.println("photo -- telegram");
	}
	
	public void whatsApp()
	{
		System.out.println("photo -- whats app");
	}
	
	
	
	

}
