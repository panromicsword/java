import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{	
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int[] arr = new int[l];
		create(arr);
		System.out.println(Arrays.toString(arr));
		int position = scan.nextInt();
		System.out.println(Arrays.toString(deleteElement(arr,position)));

	}

	public static void create(int[] arr)
	{
		int i;
		int l = arr.length;
		Scanner scan = new Scanner(System.in);
		for(i=0;i<l;i++)
		{
			arr[i]=scan.nextInt();
		}
	}

	public static int[] deleteElement(int[] arr,int position)
	{
		int i;
		int l = arr.length;
		int[] newA = new int[l-1];
		if(position>l)
		{
			System.out.println("Invalid position");
		}
		else
		{
			for(i=0;i<l;i++)
			{
				if(i!=position)
				{
					newA[i]=arr[i];
				}	
				else
				{
					continue;
				}
			}
		}
		return newA;
	}
}