import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])	
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			b[i]=i+1;
		}
		System.out.println(sum(a));
		System.out.println(product(a));
		System.out.println("---------------------------");
		System.out.println(sum(b));
		System.out.println(product(b));

	}

	public static int sum(int[] a)
	{
		int sum =0;
		int i;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	public static long product(int[] a)
	{
		long product =1;
		int i;
		for(i=0;i<a.length;i++)
		{
			product = product*a[i];
		}
		return product;
	}	
}