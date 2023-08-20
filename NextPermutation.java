import java.util.Arrays;

public class NextPermutation {

	public static void find(int arr[])
	{
		int n=arr.length;
		//find the breakpoint
		int index=-1;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]<arr[i+1])
			{
				index=i;
				break;
			}
		}
		if(index!=-1)
		{
			for(int i= n-1;i>index;i--)
			{
				if(arr[i]>arr[index])
					{swap(arr,i,index);
					break;}
			}
			reverse(arr,index+1);
		}
		else {
		reverse(arr,0);}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void swap(int arr[],int i,int index)
	{
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
	}
	
	public static void reverse(int[] arr,int left)
	{
		int right=arr.length-1;
		while(left<=right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,1,5,4,3,0,0};
find(arr);
	}

}
