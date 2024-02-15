import java.lang.*;
import java.util.*;

class Delete
{
	int[] arr = {1,2,3,4,5,};
	int min = Integer.MIN_VALUE;
	int i;

	public void delete(int value)
	{
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				arr[i]=min;
			}
		}	
	}	
}