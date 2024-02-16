import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] intArray = {1,2,3,4,5,6};
		System.out.println(searchInArray(intArray, 3));
	}

	public static int searchInArray(int[] intArray, int valueToSearch) 
	{
        // TODO
		int i;                             // O(1)
		int position =0;				   // O(1)	
		for(i=0;i<intArray.length;i++)     // O(n)
		{
			if(intArray[i] == valueToSearch) // O(1)
			{
				position = i;                // O(1)
			}
		}
		return position; 					// O(1)
    }
}