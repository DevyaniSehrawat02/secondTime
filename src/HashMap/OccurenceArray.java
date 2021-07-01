package HashMap;

import java.util.HashMap;
import java.util.Map;

public class OccurenceArray {

	public static void main(String[] args) {
		// // Find the occurence of a String in a Array
		
		String[] A={"dog","cat","dog","cat","dog"};
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<A.length;i++)
		{
			String Q=A[i];
			if(map.containsKey(Q))
			{
				map.put(Q, map.get(Q)+1);
			}
			else
			{
				map.put(Q, 1);
			}
		}
		
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>=2)
			{
			System.out.println("key "+entry.getKey()+" value "+entry.getValue());
			}
			
		}

	}

}
