package Session_13.Encapsulation;

public class _1_Company {
	
	public String name;
	public String logo;
	public int empCount;
	private String searchEngine;
	private int revenue;
	
//	setter and getter method
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setLogo(String logo)
	{
		logo = "httl//www.alphabet.com/logo";
		this.logo = logo;
	}
	
	public String getLog()
	{
		return logo;
	}
	
	public void setEmpCount(int empCount)
	{
		int emp = 10 + empCount;
		this.empCount = emp;
	}
	
	public int getEmpCount()
	{
		return empCount;
	}
	
	public void setSearchEngine(String searchEngine)
	{
		this.searchEngine = searchEngine;
	}
	
	public String getSearchEngine()
	{
		return searchEngine;
	}
	
	public void setRevenue(int revenue)
	{
	  int rev =  revenue - 100;
		this.revenue = rev;
	}
	
	public int getRevenue()
	{
		return revenue;
	}
	

}
