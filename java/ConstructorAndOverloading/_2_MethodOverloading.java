package ConstructorAndOverloading;



public class _2_MethodOverloading {
	

//	public String search(String product)
//	{
//		System.out.println("product search with product name");
//		return product;
//	}
	
	public void search(String product,int price) 
	{

//		String c = product +price;
		System.out.println("product search with product name and price -> "+product+" , "+price);
	}
	
	public void search(String product,int price,String seller)
	{
		System.out.println("product search with product name ,price and seller");
	}
	
	public void payment(long ccnNumber)
	{
		System.out.println("payment with credit card number");
	}
	
	public void payment(long ccNumber,int pin) 
	{
		System.out.println("payment with credit number and pin code");
	}
	
	public void payment(long ccNumber,int pin,String cardHolderName)
	
	{
		System.out.println("payment with credit number,pin code and payment holder name");
	}
	
	public static void main(String[] args) {
		
		
		_2_MethodOverloading productSearch = new _2_MethodOverloading();
		
		System.out.println(".................Product.............");
//		productSearch.search("laptop");
//		System.out.println(productSearch.search("laptop"));
		productSearch.search("laptop", 500);
		productSearch.search("laptop", 500, "unicorn enterprise");
		
		System.out.println(".................Payment.............");
		
		productSearch.payment(123456);
		productSearch.payment(123456, 7890);
		productSearch.payment(123456, 7890, "Rahul NIrmal");
	}

}
