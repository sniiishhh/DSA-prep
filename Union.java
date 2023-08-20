import java.util.*;
public class Union {
	
	public static void findUnion(int []a,int []b)
	{
		HashSet<Integer>hs= new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
			
		}
		
		for(int i=0;i<b.length;i++) {
			hs.add(b[i]);
		}
		
		int[]c=new int[hs.size()];
		
		int index=0;
		for(int val:hs)
		{
			c[index++]=val;
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,3};
int b[]= {1,2,3,4,5};
findUnion(a,b);
	}

}
