package ArrayQuestions;

public class FirstRecurring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={2,3,6,2,3,6,9,2,1,5};
		boolean isRecurring=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isRecurring)
			{
				break;
			}
			//System.out.println("i value"+arr[i]);
			
			for(int j=i+1;j<arr.length-1;j++)
			{
				//System.out.println(arr[j]);
				//System.out.println(arr[i]);	
				if(arr[i]==arr[j])
				{
					System.out.println("first reurring number is"+arr[i]);
					isRecurring	=true;
					break;
					
				}
			}
			

	}

}
}