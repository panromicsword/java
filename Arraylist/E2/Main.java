import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		al.add("Ramu");
		System.out.println(al);
		int i;
		String word;
		for(i=0;i<3;i++)
		{
			word = "";
			word = scan.next();
			al.add(word);
		}
		System.out.println(al);
		al.add(3,"Bm");
		System.out.println(al);
	}
}