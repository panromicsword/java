import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] ar = {1,2,3,4,5};
		reverse(ar);
	}

	public static void reverse(int[] ar)
	{
		int l =ar.length;
		int i,j=0;
		int[] newar = new int[l];
		for(i=l-1;i>=0;--i)
		{
			newar[j]= ar[i];
			j++;
		}
		System.out.println(Arrays.toString(newar));
	}
}