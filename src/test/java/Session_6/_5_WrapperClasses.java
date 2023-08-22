package Session_6;

public class _5_WrapperClasses {
	public static void main(String[] args) {
		
//		String to Integer
		

		String x = "100";
		System.out.println(x+10); //output is10010 but we need 110 then
		
	    int i = Integer.parseInt(x);
	    
	    System.out.println(i+10);
	    
//	    Integer to String
	    
	    int z = 100;
	    
	    System.out.println(z+50); //output 150 but we need 10050
	    
        String str1	= String.valueOf(z);
        
        System.out.println(str1+50);
        
//        string to double
        
        String y = "12.33";
        
        System.out.println(y+10); //12.3310 need 22.33
        
         double d  = Double.parseDouble(y);
         
         System.out.println(d+10);
         
//         string to integer (having some symbol on no.)
         
         
//         number format Exception - when no. having some symbol and we try to convert it in string to integer and doing some mathematical calculation without removing
//         symbol then exception will show over the console. for that we need to first remove that symbol.
     
//        ex 1.
         
         String s = "$456";
         String tmp = s.replace("$", "");//456
         
         int temp = Integer.parseInt(tmp);
         
         System.out.println(temp+100);
         
//         ex2
         
         String a = "$456/-";
         String tmp1 = a.replace("$", "");//456/-
         String tmp2 = tmp1.replace("/-", "");//456
         
         int temp1 = Integer.parseInt(tmp2);
          System.out.println(temp1+100);
          
//          Length of number is constant
          String b = "$4567/-";
          String tmp3 = b.substring(1,5);//4567
          int temp2 = Integer.parseInt(tmp3);
          
          System.out.println(temp2+1000);
          
//          Length of number is not constant
          
          String c = "$4,456,75/-";
          String tmp4 = c.replaceAll("[^0-9]", "");//445675
          
          int temp3 = Integer.parseInt(tmp4);
          System.out.println(temp3+1000);
          
         
         
         
         
         
         
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
