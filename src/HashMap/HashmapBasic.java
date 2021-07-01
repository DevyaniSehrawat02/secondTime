package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapBasic {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		HashMap<String,Integer> map1=new HashMap<String,Integer>(2);
		HashMap<String,Integer> map2=new HashMap<String,Integer>(2,0.5f);
		HashMap<String,Integer> map3=new HashMap<String,Integer>(map); //create a hash which is intialized wd the element in map
		
		map.put("one", 1);
		map.put("five", 5);
		map.put("ten", 10);
		map.put("six", 5);
		map.put("fifteen", 15);
		
		map1.put("ninty", 90);
		map2.put("fourty", 40);
		
		System.out.println("mapping" +map);
		
		System.out.println(map.size());
		
		//to update the value of five
		map.put("five", 50);
		//map.remove("six");
		
		//put all the value of map1 to map2
        map1.putAll(map2);
        System.out.println(map1);
		
		//to check the key is present
		if(map.containsKey("five"))
		{
		Integer a=map.get("five");
		System.out.println("value "+a);
		
		//print the respective value if key is not found
		System.out.println(map.getOrDefault("sixty", 100));
		map.putIfAbsent("nine", 9);
		
		//Traversal
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+""+e.getValue());
		}
	}
	}
}
