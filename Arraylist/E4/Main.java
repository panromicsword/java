import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[] ar = {1,3,4,5};
		printUnordered(ar);
	}

	public static void printUnordered(int[] ar)
	{
		int i,j;
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				System.out.print(ar[i]+""+ar[j]+" ");
			}
			System.out.print("\t\n");
		}
	}
}