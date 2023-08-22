package Session_12;

public interface _2_UsMedical extends _1_WHO {

	int medicalFees = 10;//this variable is static and final
	
	public void physioService(); //Abstract (prototype) Method
	
	public void oncologyService(); //Abstract (prototype) Method
	
	public void orthoPedicService(); //Abstract (prototype) Method
	
	public void radiologySerice(); //Abstract (prototype) Method
	
	public static void radiologyService()
	{
	 System.out.println("Us -- radiologyService");	
	}
	
	default void intership()
	{
		System.out.println("Us -- intership");
	}
	
	
}
