import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		ll.insert(8);
		ll.insert(9);
		ll.insert(10);
		ll.insert(99);
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
	public void insert(int data)
	{
		Node n = new Node(data);
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
			System.out.print(current.data+" ");
			current = current.nextNode;
		}
	}
}

class Node
{
	public int data;
	public Node nextNode;
	Node(int d)
	{
		this.data =d;
		this.nextNode = null;
	}
}