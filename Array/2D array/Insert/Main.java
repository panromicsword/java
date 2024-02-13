import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Insert in = new Insert();
		in.insertElements(0,0,1);
		in.insertElements(0,1,2);
		in.insertElements(1,0,3);
		in.insertElements(1,1,4);
		in.insertElements(1,2,2);	
		System.out.println("---Access-----");
		in.accessElements(0,0,1);
		in.accessElements(0,1,2);
		in.accessElements(1,0,2);
		in.accessElements(1,1,5);
		in.accessElements(0,2,1);		
	}
}