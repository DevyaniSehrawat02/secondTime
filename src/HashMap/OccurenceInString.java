package HashMap;

import java.util.HashMap;
import java.util.Map;

public class OccurenceInString {

	public static void main(String[] args) {
		// Find the occurence of a character in a string
		
		String str="madaaam";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char A=str.charAt(i);
			if(map.containsKey(str.charAt(i)))
			{
				
				map.put(A,map.get(A)+1);
			}
			else
			{
			   map.put(A, 1);
			}
		
		}
for(Map.Entry<Character,Integer> entry:map.entrySet())
{
	if(entry.getValue()>=2)
	{
	System.out.println("key "+entry.getKey()+" value "+entry.getValue());
	}
	
}


		
		
	}

}
