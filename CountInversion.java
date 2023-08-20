
public class CountInversion {
	public static void count(int arr[])
	{int inv=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])inv++;
			}
		}
		
		System.out.println(inv);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,10,10};
count(arr);
	}

}
