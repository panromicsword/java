import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		CircularLinkedList cl = new CircularLinkedList();
		cl.add(10);
		cl.display();
	}
}

class Node
{
	public int data;
	public Node node_add;

	Node(int data)
	{
		this.data = data;
		this.node_add = null;
	}
}

class CircularLinkedList
{
	Node head;
	Node tail;
	CircularLinkedList()
	{
		this.head = null;
		this.tail = null;
	}

	//adding data to list
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node pointer =  head;
			while(pointer!=null)
			{
				
				pointer = pointer.node_add;
			}
			pointer.node_add = newNode;
		}
	}

	//method to display 
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node pointer = head;
			while(pointer!=null)
			{
				System.out.print(pointer.data+" ");
				pointer = pointer.node_add;
			}
		}
	}
}