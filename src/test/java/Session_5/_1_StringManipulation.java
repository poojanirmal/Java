package Session_5;

public class _1_StringManipulation {
	
	public static void main(String[] args) {
		
//	String - it is stored multiple number of words or character	
//	for calculating the length of string type array used - .length()
		
		String str1 = "Hello everyone How Are You";
		
//		System.out.println(str1.length());
		
//		int i = str1.length();
		
//		System.out.println("The length of an string " + i);
		
		
//		To find a character at some specific value - .charAt(int index value)
		
		String str2 = "Hello Everyone";
		
//		System.out.println(str2.charAt(2));
		
//		int c1 = str2.length();
		
//		System.out.println(str2.charAt(14)); / Exception string index out of bond
		
		
//		To find the index value of some character - .indexOf(ch)
		
		String str3 = "Hello There";
		
		System.out.println(str3.indexOf('e'));
		
		 int d = str3.indexOf('e');
		 System.out.println("The index value of charachter is ->" + d);
		 
		 
//		for a same character index value
		 
		 String str4 = "Hello There";
		 
		 System.out.println(str4.indexOf('e',2));
		 
		 int k = str4.indexOf('e',2);
		 
		 
		 
//		 due to some reason spelling changed then index value also changed that means as per above 2 index value
		 
		 String str5 = "Hello There";
		 
		 System.out.println(str5.indexOf('e', str5.indexOf('e')+1));
		 
		 int g = str5.indexOf('e', str5.indexOf('e')+1);
		 
		 
//	     character or word which is not in string - output is -1
		 
		 System.out.println(str5.indexOf('z'));
		 
//		 Index position of word
		 
		 String str6 = "GitHub is aquired by microsoft by 2018";
		 
		 System.out.println(str6.indexOf("by"));
		 
		 System.out.println(str6.indexOf("am"));
		 
		 int w = str6.indexOf("by");
		 

//		 Converting all character either in Upper case or lower case

//		 upper case
		 
		 String str7 = "SELENIUM CANnot autoMATE";
		 
		 System.out.println(str7.toUpperCase());
		 
//		 Lower Case
		 
		  System.out.println(str7.toLowerCase());
		  
		  
//		  For Removing Wide Space
		  
		  String str8 = "              selenium cannot automate         ";
		 
		  System.out.println(str8.trim());
		  
		  String e = str8.trim();
		  
		  
//		Replacing the symbol
		  
		  String str9 = "12/08/2008";
		  
		  System.out.println(str9.replace('/','@'));
		  
//		  Replacing the common things
		  
		  System.out.println(str9.replace("08","09"));
		  
		  String r = str9.replace("08","09");//
		  
//		  Finding the word with same spelling - Contains method
		  
		  String str10 = "Selenium can handle the html";
		  
		  System.out.println(str10.contains("Selenium"));
		  
		  boolean t = str10.contains("Selenium");
		  
//		  when only number get changed and all other are constant also length of number constant - subString method
		  
		  String str11 = "The transaction code is - 45$564";// 234%67
		  
		  System.out.println(str11.substring(26));
		  
		  
		  
		  String str12 = "The transaction code is - 45$564 thank you";
		  
		  System.out.println(str12.substring(26,32));
		  
		  String y = str12.substring(26,32);
		  
//		  Comparison of statement
//		  case sensitive
		  
		  String statement1 = "Java is platform independent";
		  String statement2 = "Java is platform Independent";
		  String statement3 = "Java is platform independent";
		  
          System.out.println(statement1.equals(statement2));
		  
          System.out.println(statement1.equals(statement3)); 
          
//          Ignore case sensitivity validation
          
          
          System.out.println(statement1.equalsIgnoreCase(statement2));
          
//          every word on next line - spilt method
          
          String str14 = "Java is based on object oriented";
        		  
         String[] words = str14.split(" ");
         
         for(int p = 0; p<words.length;p++)   
         {
        	 System.out.println(words[p]);
         }
         
//         Reverse word
         String str15 = "Good Bye";
         String revwords[] = str15.split(" ");
         
         System.out.println(revwords[1] + " " + revwords[0]);
        		  
          

		  
		  
		  
		  
		  
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
