import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		String a = "Civc";
		a = a.toLowerCase();
		int i;
		int l = a.length();
		String n = "";

		for(i=l-1;i>=0;--i)
		{
			n = n+a.charAt(i);
		}
		System.out.println(n);
		if(a.equals(n))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}