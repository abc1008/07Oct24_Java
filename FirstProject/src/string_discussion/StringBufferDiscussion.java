
package string_discussion;

public class StringBufferDiscussion
{

	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println();
		System.out.println("*** String ***");
		System.out.println();
		
		
		String s1 = "abc";   // immutable objects
		System.out.println(s1);
		
		
		s1.concat(" pqr");    // create new object hence immutable
		
		System.out.println(s1);
		
		
		
		System.out.println();
		System.out.println("*** StringBuffer ***");
		System.out.println();
		
		
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		
		
		sb.append(" pqr");   // modify the original object, hence mutable
		System.out.println(sb);
		
		
		
		
		
		
		
	}
}
