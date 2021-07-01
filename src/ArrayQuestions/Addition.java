package ArrayQuestions;

public class Addition {

	public static void main(String[] args) {
		// Input: nums = [2,7,11,15], target = 9
		//  Output: [0,1]
		// Output: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		int num[]={1,4,5,8,2,7};
		int K=10;
		
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				int z=num[i]+num[j];
				//System.out.println(z);
				if(z==K)
				{
					
					System.out.println(i+"index"+j);
				}
				
			}
		}

	}

}
