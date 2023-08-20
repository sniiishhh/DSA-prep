import java.util.Arrays;

public class Reverse {

	public static void generate(int arr[])
	{
	int	left=0;
	int right=arr.length-1;
		
		while(left<right)
		{//swap
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,6,7,8,9};
generate(arr);
	}

}
