package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		
		set.add("man");
		set.add("hello");
		set.add("bye");
		set.add("hi");
		set.add("fine");
		set.add("man");  //does not allow duplicate value
		set.add("go");
		set.add("come");
		set.add("takecare");
		set2.add("set2");
		
		System.out.println(set);
		
		//set.remove("go");
		set.size();
		System.out.println(set.contains("go"));
		
		/*//Traversing
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String str:set)
		{
			System.out.println(str);
		}*/
		
		//set to array
		String[] B=new String[set.size()];
		B=set.toArray(B);
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		
		//array to set
		HashSet<String> set4=new HashSet<String>();
		for(int i=0;i<B.length;i++)
		{
			set4.add(B[i]);
		}
		System.out.println(set4);
	}

}
