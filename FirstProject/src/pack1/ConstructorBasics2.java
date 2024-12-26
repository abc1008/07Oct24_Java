package pack1;

public class ConstructorBasics2
{
	
	int a;
	int b;
	
	public void m1(int num1, int num2)  // build logic
	{
		a = num1;
		b = num2;
	}

	
	public static void main(String[] args)
	{
		ConstructorBasics2 c1 = new ConstructorBasics2();
		c1.m1(800,900);
//		
//		System.out.println(c1.a);
//		System.out.println(c1.b);

	}

}

