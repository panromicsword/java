import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String args[])	
	{
		LinkedList l = new LinkedList();
		int i;
		for(i=0;i<4;i++)
		{
			l.add(i);
		}
		l.display();
		l.insertAtBeginning(90);
		l.display();
		l.insertAtIndex(2,18);
		l.display();
	}
}
class Node
{
	int data;
	Node next_node;
	Node(int data)
	{
		this.data = data;
		this.next_node = null;
	}
}
class LinkedList
{
	Node head;
	LinkedList()
	{
		this.head = null;
	}
	//1. method to add the data in the linked list at last
	public void add(int data)
	{
		Node temp = new Node(data);
		//check for null in head
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			//check for null in the node so create a temporary pointer
			Node pointer = head;
			while(pointer.next_node!=null)
			{
				pointer = pointer.next_node;
			}
			pointer.next_node = temp;
		}
	}
	//method to display the data
	public void display()
	{
		if(head==null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			Node pointer = head;
			while(pointer!=null)
			{
				System.out.print(pointer.data+" ");
				pointer = pointer.next_node;
			}
			System.out.println("");
		}
	}
	//method to insert data at beginning
	public void insertAtBeginning(int data)
	{
		//check for empty list
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node n = new Node(data);
			n.next_node = head;
			head = n;
		}
	}

	//method to insert at particular position
	public void insertAtIndex(int index,int data)
	{
		int i;
		Node temp = new Node(data);
		if(index == 0)
		{
			temp.next_node = head;
			head = temp;
		}
		else
		{
			Node pointer = head;
			for(i=0;i<index-1&&pointer!=null;i++)
			{
				pointer = pointer.next_node;
			}
			temp.next_node = pointer.next_node;
			pointer.next_node = temp;
		}
	}
}