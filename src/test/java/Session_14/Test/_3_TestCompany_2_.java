package Session_14.Test;

import Session_14._1_company;

public class _3_TestCompany_2_ extends _1_company{
	
//	for protected
	public String changeCeoName()
	{
		ceoName ="Mr.Tom";
		return ceoName;
	}
	
//	for default
//	public void changeCompanyBranch()
//	{
//		companyBranchName = "Alphabet";
//		return companyBranchName;
//	}
	
//	for private
//	public void ChangeRevenue()
//	{
//		revenue = 10000;
//	}
	
//	for public
	
	public int changeEmpCount()
	{
		empCount = 400;
		return empCount;
	}
	
	
	
	
	
		
	public static void main(String[] args) {
		
		_3_TestCompany_2_ tc = new _3_TestCompany_2_();
		
		System.out.println("The change ceo name -> "+tc.changeCeoName());
		System.out.println("The change employee count -> "+tc.changeEmpCount());
		
		
		
		
		
		
		
		
		
		
		
		
	}	
			
}
