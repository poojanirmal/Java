package Session_10.Constructors;

public class _3_Reg {
	
	String firstName;   //mandatory
	String lastName;  //mandatory
	int phoneNumber;  //mandatory
	String emailId;     //mandatory
	String password;     //mandatory
	String address;      //non mandatory
	String dob;          //non mandatory
	String dlNumber;     // non mandatory
	String gender;       //non mandatory
	boolean ageLimit;    //non mandatory
	int otp;              //mandatory
	
	
	public _3_Reg()
	{
		System.out.println("please pass some values....");
	}
	
//	with mandatory + non mandatory
	
	public _3_Reg(String firstName,String lastName,int phoneNumber,String emailId,String password,String address,String dob,String dlNumber,String gender,boolean ageLimit,int otp)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.dlNumber = dlNumber;
		this.gender = gender;
		this.ageLimit = ageLimit;
		this.otp = otp;
		
		
	}
	
//	with mandatory only
	public _3_Reg(String firstName,String lastName,int phoneNumber,String emailId,String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}
	
	public void doRegistrationWithAllfield()
	{
		System.out.println(firstName+lastName+phoneNumber+emailId+password+address+dob+dlNumber+gender+ageLimit+otp);
	}
	
	public void doRegistrationWithMandatoryFields()
	{
		System.out.println(firstName+lastName+phoneNumber+emailId+password);
	}
	
	
	
	

}
