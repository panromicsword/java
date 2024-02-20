import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] array = {1,2};
		System.out.println(Arrays.toString(middle(array)));
	}

	public static int[] middle(int[] array)
	{
		int index = 1;
		int[] newarray = new int[array.length-2];
		while(index<newarray.length+1)
		{
			newarray[index-1]=array[index];
			index++;
		}
		return newarray;
	}
}