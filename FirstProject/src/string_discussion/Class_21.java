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
		
		
//		String s1 = "Testometer";
		
//		3. charAt(int index);
		
		System.out.println(s1.charAt(1));
//		System.out.println(s1.charAt(1));
//		System.out.println(s1.charAt(2));
		
		for(int index = 0; index < s1.length(); index++)
		{
			System.out.println(s1.charAt(index));
		}
		

//		4. equals()
		
		 boolean result = s1.equals("testometer");
		System.out.println(result);
		
//		String s1 = "Testometer";
		
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
		
		
		
		
		
	}
	
	
	
	

}
