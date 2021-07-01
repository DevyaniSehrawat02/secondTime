
public class ReverseArray {

	public static void main(String[] args) {
		
		//Reverse a string by using array
		String A[]={"hi","hello","bye","okie","hmm"};
		/*String B[]=new String[5];
		 String H="";
		int j=0;
		for(int i=A.length-1;i>=0;i--)
		{
			//String Z=A[i].toString();
			for(int k=A[i].length()-1;k>=0;k--)
			{
				
				H=H+A[i].charAt(k);
				
			}
			//System.out.println(H);
			
			B[j]=H;
			H="";
			j++;
		}
		
		for(int k=0;k<B.length;k++)
		{
			System.out.println("Elements are "+B[k]);
		}*/
	
		String M;
		//Reverse the list on the same array
		for(int left=0,right=A.length-1;left<=right;left++,right--)
		{
			M=A[left];
			A[left]=A[right];
			A[right]=M;
			
		}
		for(int k=0;k<A.length;k++)
		{
			System.out.println("Elements are "+A[k]);
		}
		
	}

}
