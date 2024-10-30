package pack1;

public class VariableDiscussion
{

//	static dataType variableName = value;
	static int num1;
	static String s1 = "String1";
	
	// dataType variableName = value;
	int num2 = 500;   // non-static variable
	boolean result = false;
	
	
	public void m1()
	{
		System.out.println(num1);
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println(num1);
		
		VariableDiscussion ref1 = new VariableDiscussion();
		
		System.out.println(ref1.num1);
		System.out.println("Non-Static : " + ref1.num2);
		System.out.println("Non-Static : " + ref1.result);
	
	
	
	
	}
	
}
