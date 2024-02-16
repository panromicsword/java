import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {10,1,2,3,4};
		System.out.println(permutation(array1, array2));
	}

	public static boolean permutation(int[] array1, int[] array2){
        // TODO
		int i;
		Arrays.sort(array1);
		Arrays.sort(array2);
		for(i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])
			{
				return false;
			}
		}
		
		return true;
    }
}