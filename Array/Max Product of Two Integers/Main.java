import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] intArray = {10,20,30,40,50};
		System.out.println(maxProduct(intArray));
	}
	public static String maxProduct(int[] intArray) {
        // TODO
        int i;
		int product = Integer.MIN_VALUE;
		int max=0;
		String pairs = "";
		for(i=0;i<intArray.length-1;i++)
		{
			max = intArray[i]*intArray[i+1];
			if(max>product)
			{
				product = max;
				pairs = Integer.toString(intArray[i])+" "+Integer.toString(intArray[i+1]);
			}
		}
		return pairs;
    }
}