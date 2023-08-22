package StringManipulation;

public class String_Manipulation {
	
	public static void main(String[] args) {
		
//		character at some index position
		
		String welcomeMsg = "Hello Everyone";
		
		System.out.println("character at 1st index position -> "+welcomeMsg.charAt(1));
		
		
//		index value of some character
		
		System.out.println("index value of E -> "+welcomeMsg.indexOf('E'));
		
		
//	length of the string
		
		System.out.println(welcomeMsg.length()); //14
		
//		System.out.println("character at 15th index position -> "+welcomeMsg.charAt(15)); string indexOutOfBound Exception
		
//	same character occur then index position of 2nd character
		
		String st = "Hello There";
		 
		 System.out.println(st.indexOf('e',2));
		 
//		 int k = st.indexOf('e',2);
		 
		 
		 
//		 due to some reason spelling changed then index value also changed that means as per above 2 index value
		 
		 String s = "Hello There";
		 
		 System.out.println(s.indexOf('e', s.indexOf('e')+1));
		
//	index position of character or word which is not in string
		
		System.out.println(welcomeMsg.indexOf('t'));//-1
		
		System.out.println(welcomeMsg.indexOf("we"));//-1
		
//	index position of word
		
		String str = "Hey i am here";
		
		System.out.println(str.indexOf("am"));
		
//	converting all character either in lower or upper case
		
		String str1 = "are YOu reAdy";
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
//  Removing wide space
		
		String str2 = "              Everything is ok              ";
		
		System.out.println(str2.trim());
		
		
//	Replacing symbol
		
		String date = "12/03/2003";
		System.out.println(date.replace('/', '#'));
		
//	Replacing common things
		
		System.out.println(date.replace("03", "09"));
		
//	finding the word with same spelling
		
		String str3 = "selenium is most important tool in testing";
		System.out.println(str3.contains("selenium"));
		System.out.println(str3.contains("Tool"));
		
//	sub-string method
		
		String str4 = "The transaction code is 123456 Thank you";
		System.out.println(str4.substring(25, 30));
		
		String str5 = "The pin code is -> 12345";
		System.out.println(str5.substring(19));
		
//	comparison of statement
		
		String str6 = "HELLO everyone";
		String str7 = "hello Everyone";
		String str8 = "HELLO everyone";
		
		System.out.println(str6.equalsIgnoreCase(str7));
		System.out.println(str7.equals(str8));
		System.out.println(str6.equals(str8));
		
//	split method
		
		String str9 = "Hello everyone i am Pooja";
        String[] str11 = str9.split(" ");
        for(int i = 0;i<str11.length;i++)
        {
        	System.out.println(str11[i]);
        }
		
//	Reverse method
		
		String str10 = "Hello User";
		
		String[] str12 = str10.split(" ");
		
		System.out.println(str12[1]+" "+str12[0]);
		
		
		
		
		
		
		
		
		
	}

}
