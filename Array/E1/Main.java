import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		int i;
		System.out.println(Arrays.toString(A));
		for(i=0;i<A.length;i++)
		{
			System.out.println("Enter the value for A["+i+"]");
			A[i]=scan.nextInt();
		}
		for(i=0;i<A.length;i++)
		{
			System.out.println("The value for A["+i+"] - "+A[i]);
		}
		for(int item:A)
		{
			System.out.println(item);
		}
		System.out.println(Arrays.toString(A));
		

	}
}