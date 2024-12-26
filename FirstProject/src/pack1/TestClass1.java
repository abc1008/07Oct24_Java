package pack1;

public class TestClass1
{
	
	static byte num9;
	static boolean flag;
	
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println(num9);  // 0
		System.out.println(flag);  // 
		
		byte num = 10;  		// -128 to +127   // 1 byte = 8 bit
		short num2 = 20;     // 2 byte
		int num3 = 30;      // 4 byte
		long num4;   // variable initialization   // 8 byte 
		num4 = 100;  // variable declaration
		
		
		int num6 = 50;  // variable initialization  +  variable declaration
		
		float num7 = 50.6F;
		double num8 = 60.55;
		
		char ch = 'c';  
		boolean b = true;
		
		System.out.println(num2 + " " + num);
		
		
		String s1 = "Test_1";  // String Literal  // 1 object is created
		System.out.println("String value is : " + s1);
		
		
		s1 = "tttt";
		
		
		String s2 = new String("Test_2");  // 2 objects are created in memory
		System.out.println(s2);
		
		
		
		String s3  = "Test_2";
		
		
		
		String s4 = new String("Test_2");
		
		
		
		// datatype [] variableName =  new dataType[count of data to be stored];
		
		

		
		
		String [] sArray = new String[7];  // size/length of array = total number of elements that can be present in array
		char [] chArray = new char[4];
		
		int [] array1 = new int[5];  // 20 bytes
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		
		array1[0] = 100;
		array1[1] = 200;
		array1[2] = 800;
		array1[3] = 300;
		array1[4] = 600;
		
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		// maximum index of array =  Array Length - 1
		
		System.out.println(array1.length);
		
		
		
		// dataType [] arrayName = {data,data,data};
		
		
		String [] sArray2 = {"S1", "S2","S3","S4"};
		
		sArray2[2] = "S7";
		
		
		Switchcase s5 = new Switchcase();
		
		
	}
	
	
	
	
	
	

}
