package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(); //capacity is 12 but size is 5
		int n=10;
		int b=11;
		int d=12;
		int m=13;
		
		//Add
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(6);
		list.add(5);
		
		System.out.println(list);
		
		//convert list into array of same size as list using to array method of list
		Integer B[]=new Integer[list.size()];
		B=list.toArray(B);
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		
		
		
		//Array to list
		List<Integer> A=Arrays.asList(B);
		System.out.println(A);
		//can be declared as
		List<Integer> D=new ArrayList<Integer>(Arrays.asList(B));
		Collections.addAll(D, B); //add all the element of array into list
		System.out.println(D);
		//manual method to add into list from array
		for(Integer itr:B)
		{
			D.add(itr);
		}
		System.out.println(D);
		
		
		
		//list.add(2, 33);
		//System.out.println(list.get(3));
		//System.out.println(list);
		
		//set value to a specified location
		//list.set(1, 22);
		//System.out.println(list);
		
		//remove by index and by value
		//list.remove(0);
		//list.remove(2);
		//System.out.println(list);
		
		//to calculate the size of the arraylist
		System.out.println(list.size());
		
		//iterate
		/*for(Integer A:list)
		{
			System.out.println(A);
		}*/
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//sort method is provided by the collection class
		
		Collections.sort(list);
		System.out.println(list);
		//to check whether contains the data
		System.out.println(list.contains(10));
		

	}

}
