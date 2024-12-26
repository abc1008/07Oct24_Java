package pack1;

public class VariableDiscussion4
{
	
	int num = 80;
	static int num2 = 50;
	
	public static void main(String[] args)
	{
		
		VariableDiscussion4 v1 = new VariableDiscussion4();
		System.out.println("value of num based on v1 object before reinitialization: " + v1.num);
		v1.num = 90;
		System.out.println("value of num based on v1 object after reinitialization: " +v1.num);
		
		
		VariableDiscussion4 v2 = new VariableDiscussion4();
		System.out.println("value of num based on v2 object : " + v2.num);
		
		
		VariableDiscussion4 v3 = new VariableDiscussion4();
		System.out.println("value of num based on v3object : " + v3.num);
		
		
		System.out.println(); 
		System.out.println("******** Static Variable **********");
		System.out.println(); 
		
		
		System.out.println("value based on v1 before reinitialization: " +v1.num2);
		v1.num2 = 30;
		System.out.println("value based on v1 after reinitialization: " +v1.num2);
		
		System.out.println("value based on v2 : " +v2.num2);
		System.out.println("value based on v3 : " +v3.num2);
		
	}
	
	
	

}
