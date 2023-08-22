package Oops_Encapsulation;

public class _1_Company {
	
	public String name;
	public int empCount;
	private String ceoName;
	private int revenue;
	
	
//	Getter and Setter method
	
	public void setName(String name)//after set and get  the first letter of variable should be capital
	{
//		name = "Accenture";
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setEmpCount(int empCount)
	{
		int emp = empCount + 100;
		this.empCount = emp;
	}
	
	public int getEmpCount()//here only return statement
	{
//		int emp = empCount + 100;
		return empCount;
	}
	
	
	public void setCeoName(String ceoName)
	{
		this.ceoName = ceoName;
	}
	
	public String getCeoName()// in return type of method there is no any argument
	{
		return ceoName;
	}
	
	
	public void setRevenue(int revenue)
	{
		int rev = revenue / 2;
		this.revenue = rev;
	}
	
	public int getRevenue()
	{
		return revenue;
	}
	

	
}