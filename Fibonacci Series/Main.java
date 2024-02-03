import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		System.out.println("Fibonacci Series");
		int child = 0;
		int parent = 1;
		int temp;
		System.out.println(child);
		System.out.println(parent);
		int i;
		int count = 5;
		for (i=0;i<=count;i++)
		{
			temp = child+parent;
			child = parent;
			parent = temp;
			if(temp%2==0)
			{
				System.out.println(temp);
			}
		}
	}
}