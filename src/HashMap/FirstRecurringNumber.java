package HashMap;

import java.util.HashMap; //1212123
import java.util.Map;

public class FirstRecurringNumber {
	
	public int recurring(int[] arr,Map<Integer,Integer> map)
	{
		
	for(int i=0;i<arr.length;i++)
	{
		if(map.containsKey(arr[i]))
			return arr[i];
		else
		map.put(arr[i], 1);
	}
	return 0;
	}

	public static void main(String[] args) {
		   
		
		   int[] arr={1,3,6,6,3,6,9,2,1,5};
		
		
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(arr.length);
			
			
			FirstRecurringNumber n=new FirstRecurringNumber();
			System.out.println("First Recurring number is "+n.recurring(arr,map));
			
		
		
		
	}
	
	

	}


