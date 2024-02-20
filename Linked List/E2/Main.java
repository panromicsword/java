import java.lang.*;
import java.util.*;
import java.net.URL;

class Main
{
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		try
		{
			ll.insert(new URL("https://open.spotify.com/track/2RB3zzgxWc2RRBaJOkSEka"));
			ll.insert(new URL("https://open.spotify.com/track/6MsjkottA1KwG7X0rELec5"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		ll.display();
	}
}

class LinkedList
{
	Node head;
	LinkedList()
	{
		this.head = null;
	}
	public void insert(URL song)
	{
		Node n = new Node(song);
		if(head==null)
		{
			this.head = n;
		}
		else
		{
			Node current = head;
			while(current.nextNode!=null)
			{
				current = current.nextNode;
			}
			current.nextNode = n;
		}
	}

	public void display()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current = current.nextNode;
		}
	}
}

class Node
{
	public URL data;
	public Node nextNode;
	Node(URL s)
	{
		this.data =s;
		this.nextNode = null;
	}
}