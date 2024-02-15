import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};  // O(1)
		int i;					  // O(1)	
		for(i=0;i<arr.length;i++) // O(n)
		{
			System.out.println(arr[i]+" is present in the index "+i); // O(1)
		}
		int value=100; // O(1)
		boolean status=false; // O(1)
		for(i=0;i<arr.length;i++) // O(n)
		{
			if(arr[i]==value) // O(1)
			{
				status = true;  // O(1)
			}
		}

		if(status==true) // O(1)
		{
			System.out.println("Present"); // O(1)
		}
		else // O(1)
		{
			System.out.println("Not Present"); // O(1)
		}

		// Time Complexity O(n)
	}
}