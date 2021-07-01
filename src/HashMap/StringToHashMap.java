package HashMap;

import java.util.HashMap;

public class StringToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str={"dog","boy"};
		HashMap map=new HashMap();
		//for()
		String A="hdifi:nshfis,djbvdj:bvdj,dh:gs,gfs:ygfy";
		String[] S=A.split(",");
		for(int i=0;i<S.length;i++)
		System.out.println(S[i]);
		for(String p:S)
		{
			//System.out.println();
			String X[]=p.split(":");
			for(int i=0;i<X.length;i++)
				System.out.println(X[i]);
			String m=X[0].trim();
			String n=X[1].trim();
			map.put(m, n);
			
			
		}
		System.out.println(map);

	}

}
