import java.util.Arrays;

public class NegativeElementsToOneSide {
	
	public static void  generate(int arr[])
	{int left=0;
	int right=arr.length-1;
	while(left<right)
	{
		if(arr[left]>-1)
		{
			swap(arr,left,right);
			left++;
			right--;
		}
		 if(arr[left]<=-1)left++;
		
		 if(arr[right]<=-1)
		 {
			 swap(arr,right,left);
			 right--;
			 left++;
		 }
		 if(arr[right]>-1)right--;
		
	}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int arr[],int left,int right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,-1,7,4,-5,-6};
		generate(arr);

	}//g

}
