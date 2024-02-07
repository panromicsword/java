import java.lang.*;
import java.util.*;

class Collec
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int item=0;
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter the data for arraylist -");
			item = scan.nextInt();
			al.add(item);
		}
		for(Integer num: al)
		{
			System.out.print(num+" ");
		}
		System.out.print("\n");
		int user;
		for(i=0;i<2;i++)
		{
			System.out.println("Enter the position/index to get the number - ");
			user = scan.nextInt();
			System.out.println(al.get(user));
		}	
	}
}
