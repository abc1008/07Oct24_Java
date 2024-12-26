package pack1;

public class MethodCatrgories
{
	// void - nothing
	public void addition(int num1, int num2, boolean result, float i)
	{
		int ans = num1 + num2;
		System.out.println(ans);
	}

	public boolean subtraction()
	{
		int num1 = 600;
		int num2 = 200;
		int ans = num1 - num2;

		if (ans > 100)
		{

			return true;
		} else
		{
			return false;
		}
	}

	public int multiplication(int num)
	{

		MethodCatrgories ref1 = new MethodCatrgories();
		boolean subtractionAns = ref1.subtraction();
		System.out.println(subtractionAns);

		System.out.println("Argument is : " + num);

		int mulResult = num * 33;
		
//		System.out.println(mulResult);

		return mulResult;

	}

	public static void main(String[] args)
	{
		
		// ClassName refVariableName = new ClassName();
		MethodCatrgories ref1 = new MethodCatrgories();
		ref1.addition(50, 60, true, 8.8f);
		ref1.addition(500, 600, true, 8.8f);

//		int result = ref1.subtraction();

//		System.out.println(result);

//		int result2 = result + 5000;
//		System.out.println(result2);

		System.out.println(ref1.multiplication(4));
		
		

	}

}
