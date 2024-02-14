import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int i,j;
		Insert in = new Insert();
		in.insertElements(0,0,1);
		in.insertElements(0,1,2);
		in.insertElements(1,0,3);
		in.insertElements(1,1,4);
		in.insertElements(2,0,5);
		in.insertElements(2,1,6);
		in.insertElements(1,2,2);
		System.out.println("---Printing Array-----");
		in.printing();	
		System.out.println("---Access-----");
		in.accessElements(0,0,1);
		in.accessElements(0,1,2);
		in.accessElements(1,0,2);
		in.accessElements(1,1,5);
		in.accessElements(0,2,1);
		System.out.println("---Access cells-----");
		in.accessElements(0,0);
		in.accessElements(0,1);
		in.accessElements(1,0);
		in.accessElements(1,1);
		in.accessElements(2,0);		
		System.out.println("---Traversing elements-----");
		in.traversal();
		System.out.println("---Searching elements-----");
		in.search(20);
		System.out.println("---Deleting elements-----");
		in.delete(3);
		
	}
}