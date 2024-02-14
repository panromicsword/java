import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		System.out.println(Arrays.toString(firstsecond(myArray)));
	}
	public static int[] firstsecond(int[] myArray)
	{
		Arrays.sort(myArray);
		int i;
		int[] newArray = new int[2];
		int index=0;
		int myindex = myArray.length;
		int j=1;
		while(index<newArray.length)
		{
			newArray[index]=myArray[myindex-j];
			index++;
			j++;
		}

		return newArray;
	}
}