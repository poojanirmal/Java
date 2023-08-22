package Session_4.loops;

public class _1_WhileLoop {
	
	public static void main(String[] args) {
		
//	Loops - if we want to print number from 1 to 1000 ,it is not possible to use printing statement every time so we used loops.
		
//		While loop - 1. start with what?,condition,increase the count till condition satisfied
		
//		1 to 1000
		
		int i = 1;
		while(i<=1000) 
		{
			System.out.println(i);
			i++;
//			--i; also used
		}
		
//		10 to 1 (reversed)
		
		int j = 10;
		while(j>=1)
		{
		System.out.println(j);
		j--;
//		--j;
	
        }
		
		
//		1 to 10 and where five is available print"five"
		
		int k = 1;
		while(k<=10)
		{
			System.out.println(k);
			if(k == 5) 
			{
				System.out.println("five");
				break;
			}
		
			k++;
		}
		
		
//     Example
		
		boolean isCashReceived = true;
		
		int amount = 250;
		while(isCashReceived) 
		{
			System.out.println("your bill was paid successfully ->" + amount);
			System.out.println("ThankYou !!!");
			
			isCashReceived = false;
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
