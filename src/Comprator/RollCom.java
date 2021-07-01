package Comprator;


import java.util.Comparator;

public class RollCom implements Comparator<Student> {

	@Override
	public int compare(Student a,Student b) {
		return a.roll_num-b.roll_num;
		
	}
	


}
