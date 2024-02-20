import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] intArray = {1,2,3,3,2,1};
		System.out.println(isUnique(intArray)); // true
	}

	public static boolean isUnique(int[] intArray) {
        // TODO
		int i,j;
		boolean duplicate = false;
		for(i=0;i<intArray.length;i++)
		{
			for(j=i+1;j<intArray.length;j++)
			{
				if(intArray[i]==intArray[j])
				{
					duplicate =true;
					break;
				}
			}
		}
		return duplicate;
    }
}