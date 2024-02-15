import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		char[] arr = new char[6];
		Scanner scan = new Scanner(System.in);
		int i;
		char c;
		for(i=0;i<arr.length;i++)
		{
			c=scan.next().charAt(0);
			arr[i]=c;
		}
		for(i=arr.length-1;i>2;--i)
		{
			arr[i]=arr[i-1];
		}
		
		System.out.println(arr);
		System.out.println("---------------");
		c=scan.next().charAt(0);
		arr[2]=c;
		System.out.println(arr);
	}
}