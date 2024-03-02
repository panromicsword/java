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
		System.out.println(l.length());
		l.printAdd();
		l.isContains(200);
		l.delete(2);
		l.display();
		System.out.println(l.length());
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
	Node tail;
	int size=0;
	LinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	//1. method to add the data in the linked list at last
	public void add(int data)
	{
		Node temp = new Node(data);
		//check for null in head
		if(head == null)
		{
			this.head = temp;
			this.tail = temp;
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
			tail = temp;
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
	//method to check the size
	public int length()
	{
		int length = 0;
		Node pointer = head;
		while(pointer!=null)
		{
			length = length+1;
			pointer = pointer.next_node;
		}
		size = length;
		return length;
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

	//method to print the address of the nodes
	public void printAdd()
	{
		Node pointer = head;
		System.out.println("Head|"+pointer);
		while(pointer!=null)
		{
			System.out.println(pointer.data+"|"+pointer);
			pointer = pointer.next_node;
		}
	}

	//method to check a data
	public void isContains(int data)
	{
		Node pointer=head;
		boolean setStatus = false;
		while(pointer!=null)
		{
			if(pointer.data==data)
			{
				setStatus =true;
				break;	
			}
			pointer =pointer.next_node;
		}
		if(setStatus == false)
		{
			System.out.println("Invalid data");
		}
	}

	//method to delete
	public void delete(int data)
	{
		Node current = head;
		Node previous = null;
		if(head == null)
		{
			System.out.println("Empty");
		}
		else if(pointer.data == data)
		{
			head = pointer.next_node;
			return;
		}
		else
		{
			while(current!=null && current.data!=data)
			{
				previous = current;
				current = current.next_node;
			}
			if(current == null)
			{
				System.out.println("Value is not present");
			}
			else
			{
				previous.next_node = current.next_node;
				current.next_node = null;
			}
		}
	}
}
