package pack1;

public class Switchcase
{
	
	
	public static void main(String[] args)
	{
		
		Switchcase s1 = new Switchcase();
		
		int dayNum = 2;
		
		String a = "";
		
		
		System.out.println("Code change via GIT");
		
		switch(dayNum)
		{
		
			case 0:
				System.out.println("Sunday");
				System.out.println("Sunday");
				System.out.println("Sunday");
				System.out.println("Sunday");
				break;
				
			case 1:
				System.out.println("Monday");
				System.out.println("Monday");
				System.out.println("Monday");
				
				break;
				
			case 2:
				System.out.println("Tuesday");
				System.out.println("Tuesday");
				break;
				
			default:
				System.out.println("dayNum value is incorrect");
				break;
		
		}
		
		System.out.println("out of switch case");
		
	}

}
