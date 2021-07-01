package Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {
	int roll_num;
	String Address,Name;
	
	public Student(int roll,String address,String name)
	{
		this.roll_num=roll;
		this.Address=address;
		this.Name=name;
	}
	
	public int getRollNum()
	{
		return this.roll_num;
	}
	
	public String displayStudent()
	{
		return this.Address+"  "+this.Name+"  "+"  "+this.roll_num;
	}
	
	public String getValue()
	{
		return this.Address;
	}

	public void setValue(String name)
	{
		this.Name=name;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(141,"gurgaon","sohan"));
		list.add(new Student(121,"gurgaon12","lata"));
		list.add(new Student(111,"gurgaon16","mohan"));
		
		
		list.set(0, new Student(120,"gurgaon2","piku"));
		System.out.println(list.size());
		//to array in one line
		
		Student[] B=list.toArray(new Student[list.size()]);
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i].displayStudent());
		}
		
		//contains
		System.out.println(list.contains(new Student(111,"gurgaon16","mohan")));
		//indexof
		System.out.println(list.indexOf((new Student(111,"gurgaon16","mohan"))));
		
		//ArrayList elements before sorting
		System.out.println("before Sorting -----");
		Iterator<Student> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().displayStudent());
		}
		
		//After sorting
		System.out.println("");
		System.out.println("After Sorting -----");
		Collections.sort(list, new  RollCom());
		for(Student st:list)
		{
			System.out.println(st.displayStudent());
		}

	}

}
