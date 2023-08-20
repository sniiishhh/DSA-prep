import java.util.Arrays;

public class CyclicRotation {

public static void rotate(int[]a)
{if(a.length<=1)
{
	System.out.println("no rotation");return;
}
	int left=0;
	int right=a.length-1;
	while(left<right)
	{
		swap(a,left,right);
		left++;
	}
	System.out.println(Arrays.toString(a));
}

public static void swap(int a[],int left,int right)
{
	int temp=a[left];
	a[left]=a[right];
	a[right]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1};
rotate(a);
	}

}
