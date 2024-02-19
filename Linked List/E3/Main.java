import java.lang.*;
import java.util.*;
import java.net.URL;

class Main
{
	public static void main(String args[])
	{
		LinkedList<URL> ll = new LinkedList<>();
		try
		{
			ll.add(new URL("https://open.spotify.com/track/2RB3zzgxWc2RRBaJOkSEka"));
			ll.add(new URL("https://open.spotify.com/track/6MsjkottA1KwG7X0rELec5"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		System.out.println("LinkedList - "+ll);
		for(URL link: ll)
		{
			System.out.println(link);
		}
	}
}