import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		SingleLinkedList sl = new SingleLinkedList();
		int i;
		for(i=0;i<5;i++)
		{
			sl.add(i);
		}
		sl.display();
		System.out.println("");
		System.out.println("-----------------");
		System.out.println(sl.search(1));
		sl.addAtBeginning(10);
		sl.addAtBeginning(20);
		sl.display();
		System.out.println("");
		System.out.println("Size "+sl.length());
		sl.traverse();
		sl.insert(0,100);
		sl.display();
	}
}
// Node class which is used to ceate a node for linkedlist
class Node
{
	public int value;
	public Node next_node;
	Node(int data)
	{
		this.value = data;
		this.next_node = null;
	}
}

class SingleLinkedList
{
	Node head; // starting the head for linkedlist
	int size = 0;
	SingleLinkedList()
	{
		this.head = null;
	}
	public void add(int data) //adding the element
	{
		Node n = new Node(data); //creates new node for adding elements
		if(head==null)
		{
			this.head = n; //this checks for first node
		}
		else //this check for node other than first
		{
			Node current = head; 
			while(current.next_node!=null)  //head.next_node --> check for null value
			{
				current = current.next_node; //it will iterate until last node
			}
			//once null value found then we will add the node address into the already present node
			current.next_node = n; 
		}
	}

	//method to calculate the size of linkedlist
	public int length()
	{
		Node temp = head;
		if(temp==null)
		{
			return 0;
		}
		else
		{
			while(temp!=null)
			{
				size = size+1;
				temp = temp.next_node;
			}
		}
		return size;
	}

	public void traverse()
	{
		int position = 0;
		Node temp = head;
		if(temp == null)
		{
			System.out.println("Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println("Index - "+position+" & "+"Value - "+temp.value);
				temp = temp.next_node;
				position++;
			}
		}
	}

	public void insert(int index,int data)
	{
		Node newNode = new Node(data);
		//only applicable for 0th position
		if(index == 0)
		{
			newNode.next_node = head;
			head = newNode;
		}	
		int i;
		Node current = head;
		for(i=0;i<index-1 && current!=null;i++)
		{
			current = current.next_node;
		}

		newNode.next_node = current.next_node;
		current.next_node = newNode;

	}

	//display the LinkedList
	public void display()
	{
		Node current = head; //like a pointer
		while(current!=null)
		{
			System.out.print(current.value+" ");
			current = current.next_node;
		}
	}
	
	//searching the elements
	public boolean search(int data)
	{
		Node current = head;
		boolean status = false;
		if(current.next_node==null)
		{
			return false;
		}
		else
		{
			while(current!=null)
			{
				if(current.value==data)
				{
					status = true;
					break;
				}
				else
				{
					status = false;
				}
				current = current.next_node;        
			}
		}
		return status;
	}


	public void addAtBeginning(int data)
	{
		Node n = new Node(data);
		if(head==null)
		{
			this.head = n;
		}
		else
		{
			Node temp = head;
			this.head = n;
			n.next_node = temp;
		}
	}
	
}