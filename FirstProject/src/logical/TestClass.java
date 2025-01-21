package logical;

public class TestClass {
	
	public static void getLargest(int [] nums)
	{
		int max = -1;
		
		for(int i=0; i<nums.length; i++)
		{
			max = nums[i];  // 3
			
			for(int j = (i+1); j < nums.length; j++)
			{
				int num = nums[j];
				
				if(num> max)
				{
					max = nums[j];
				}
			}
			
		}
		
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		
		int [] nums = {3,2,4,5,6,1};
		
		getLargest(nums);
		
	}

}
