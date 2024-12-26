package pack1;

public class VariableDiscussion
{

//	 Static Variables
//	static dataType variableName = value;
	static int num1 = 200;
	static String s1 = "String1";

//	Non-Static variables
	// dataType variableName = value;
	int num2 = 500; // non-static variable
	boolean result = false;

	
	public void m3()
	{
		int num2 = 900;
		
		System.out.println(num2); // local variable
		System.out.println(this.num2); // non-static variable of current class  
		
	}
	
	public void m2()
	{
		
		int num1 = 600;
		System.out.println(num1);
		System.out.println(VariableDiscussion.num1);
		
		System.out.println(s1);
		
	}
	
	
	public void m1()
	{
		System.out.println(num1);

//		dataType variableName = value;
		int variable1 = 400;
		
		System.out.println("variable1 : " +variable1);

	}

	public static void main(String[] args)
	{
		
//		System.out.println(variable1);
		
//		int variable1 = 500;
		
//		System.out.println("variable2 : " +variable1);
		
		
		System.out.println(num1);

		VariableDiscussion ref1 = new VariableDiscussion();

		System.out.println(ref1.num1);
		System.out.println("Non-Static : " + ref1.num2);
		System.out.println("Non-Static : " + ref1.result);
		
		ref1.m1();
		
		ref1.m2();
		
		ref1.m3();
	}

}
