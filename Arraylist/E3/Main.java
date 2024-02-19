import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])	
	{
		int[] a = {1,2,3,4};
		/*System.out.print(a[0]+""+a[0]+" ");
		System.out.print(a[0]+""+a[1]+" ");
		System.out.print(a[0]+""+a[2]+" ");
		System.out.print(a[0]+""+a[3]+" ");
		System.out.print(a[1]+""+a[0]+" ");
		System.out.print(a[1]+""+a[1]+" ");
		System.out.print(a[1]+""+a[2]+" ");
		System.out.print(a[1]+""+a[3]+" ");
		System.out.print(a[2]+""+a[0]+" ");
		System.out.print(a[2]+""+a[1]+" ");
		System.out.print(a[2]+""+a[2]+" ");
		System.out.print(a[2]+""+a[3]+" ");*/
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i]+""+a[j]+" ");
			}
			System.out.print("\t\n");
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.print("\t\n");
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				System.out.print("*  ");
			}
			System.out.print("\t\n");
		}
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			for(j=i;j>=i&&j<a.length;j++)
			{
				System.out.print("*  ");
			}
			System.out.print("\t\n");
		}
	}
}