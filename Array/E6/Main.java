import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] nums = {4,3,6,8};
		int targert=13;
		System.out.println(Arrays.toString(twoSum(nums,targert)));
	}
	public static int[] twoSum(int[] nums, int target) 
	{
    	// TODO
		int i,j;
		int sum=0;
		int count = 0;
		boolean check = false;
		for(i=0;i<nums.length;i++)
		{
			sum = sum+nums[i];
			if(sum==target)
			{
				check =true;
				count = i+1;
				break;
			}
		}
		int[] newA = new int[count];
		if(check==true)
		{
			for(j=0;j<count;j++)
			{
				newA[j]=j;
			}
		}
		return newA;
	}
}