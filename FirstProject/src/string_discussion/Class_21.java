package string_discussion;

public class Class_21
{
	
	
	public static void main(String[] args)
	{
		
		
		String s1 = "Testometer";
		
		// 1 . Length
		
		int num = s1.length();
		System.out.println(num);
		
		
		// 2. concat
		
		String concatString = s1.concat(" abc");
		System.out.println(concatString);
		
		
		s1 = "Testometer";
		
//		3. charAt(int index);
		
		System.out.println(s1.charAt(1));
//		System.out.println(s1.charAt(1));
//		System.out.println(s1.charAt(2));


//		true = 1
//		false = 0;
//		null = -1;
		
		
		for(int index = 0; index < s1.length(); index++)
		{
			System.out.println(s1.charAt(index));
		}
		
		

//		4. equals()
		
		 boolean result = s1.equals("testometer");
		System.out.println(result);
		
		s1 = "Testometer";
		
//		5. equalsIgnoreCase();
		
		boolean result2 = s1.equalsIgnoreCase("testometer");
		System.out.println(result2);
		
//		6. substring()
		
		 String substring1 = s1.substring(4);
		System.out.println(substring1);
		
		 String substring2 = s1.substring(2, 5);
		System.out.println(substring2);
		
		
		
//		8. replace()
		System.out.println(s1.replace('t', 'z'));
		
		
		
		s1 = "Testometer";
		
		
//		9.  touppercase and tolowercase
		
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		
		String s2 = "  java     ";
		
		
		
//		10. trim()
		
		System.out.println(s2);
		
		 String ans = s2.trim();
		
		System.out.println(ans);
		
		
		s1 = "Testoteter";

		
//		11. indexOf()
		
		int index = s1.indexOf('t');  // first occurance
		
		System.out.println(index);
		
		
//		12. lastIndexOf()
		
		int Lindex =  s1.lastIndexOf('t');  // last occurance
		System.out.println(Lindex);
		
		
//		13. contains(charseq);
		
		boolean result4 = s1.contains("Meter");
		System.out.println(result4);
		
		
//		 s1 = "Testometerttt";  // reinitialization  -  1 object
//		 s1 = s1.concat(" abc");    // Testometerttt abc
		 
//		 String s4 = new String("Testometerttt");
		 
		 System.out.println(s1);
		
//		14. toCharArray();
		
		
		  char[] chArray = s1.toCharArray();
		  
		  System.out.println(chArray[3]);
		  System.out.println(chArray.length);
		  
		  
			s1 = "Testometer";
		  
//		  15. split();
		  
		 String[] var1 = s1.split("o");
		
		 System.out.println(var1[0]);
		 System.out.println(var1[1]);
		 
		 
		 
		
		
	}
	
	
	
	

}
