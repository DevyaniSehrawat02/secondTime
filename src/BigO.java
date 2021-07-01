
public class BigO {

	public static void main(String[] args) {
		// to calculate the time taken by loop to run
		
		String[] A={"abc","gh","ffs"};
		long start=System.nanoTime();
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]=="ffs")
				System.out.println("string found");
		}
		
		long end =System.nanoTime();
		System.out.println(end-start);

	}

}
