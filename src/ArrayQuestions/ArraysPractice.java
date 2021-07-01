package ArrayQuestions;

public class ArraysPractice {

	public static void main(String[] args) {
		String A[]={"A","B","C","D"};
		String[] B=new String[10];
		
		//adding element into the array from A to B
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
			System.out.println(B[i]);
		}
		
		//delete an element from array
		A[2]="NULL";
		System.out.println(A[2]);
		//After deleting again assinging the value to the array
		A[2]="CC";
		System.out.println(A[2]);
		
		
		//Cannot add into array once his size is decide
		//A[4]="M";
		
		//retriving data by index
		System.out.println(A[2]);
		
		//retrieving and searching element
		for(int i=0;i<A.length;i++)
				{
			if(A[i]=="D")
			{
				System.out.println(i+"\t"+A[i]);
			}
				}
		

	}

}
