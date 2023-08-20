
public class Duplicate1 {

	  public static  int findDuplicate(int[]nums)
	  {
		  for (int i = 0; i < nums.length; i++) {
	            int val = Math.abs(nums[i]) - 1;
	            if (nums[val] < 0) {
	                return val + 1;
	            } else {
	                nums[val] = -nums[val];
	            }
	        }
	        return -1;
	  }	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,3,3,2,4,5};
System.out.println(findDuplicate(nums));
	}

}
