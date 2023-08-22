package Session_4.loops;

public class _2_ForLoop {
	
	public static void main(String[] args) {
		
//		1 to 10
		
		for(int i = 1; i<=10; i++) 
		{
			System.out.println(i);
		}
		
		
//		0,2,4,6.......20 even no.
		
		for(int even = 0; even<=20; even = even+2)
		{
			System.out.println(even);
		}
		
		
//	in above if starting point change the output also change
//		so here is the proper way
		
		for(int k = 0; k<=20; k++) 
		{
			if(k % 2 == 0) 
			{
				System.out.println(k);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
