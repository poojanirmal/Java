package Session_4.ArraysInJava;

public class _1_arraysInJava {
	
	public static void main(String[] args) {
		
		
		int i = 10;
//		System.out.println(i);
		
		i =20;
//		System.out.println(i);
		
		i = 30;
		System.out.println(i);
		
		
//		Different writing type of Arrays
		
//	                     Capacity    Index position
		int[] x = new int[4];//0 1 2 3
		
		int []y = new int[3];// 0 1 2
		
		int z[] = new int[2];// 0 1
		
		int []k = {10,20,30};
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		
		System.out.println(x[0]);
		System.out.println(x[0]+x[1]);//10+20 = 30
		
//		how to know the capacity of array - .length in numeric, for string it - .length()
		
		System.out.println(x.length);
		
		System.out.println(y.length);
		
		
//		printing All value over the console
		
		for(int j = 0; j<x.length; j++)
		{
			System.out.println(x[j]);
		}
			
		
//		find the index value of particular value
		
		int []h = new int[5];
		
		h[0] = 10;
		h[1] = 20;
		h[2] = 30;
		h[3] = 40;
		h[4] = 40;
		
		for(int m = 0; m<h.length; m++) 
		{
			if(h[m]== 40) 
			{
			System.out.println("The index position of 45 is ->" + m);
			break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
