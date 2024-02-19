import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.createSinglyLinkedList(5);
		System.out.println(sl.head.value);
	}
}

class Node
{
	public int value;
	public Node next;
}

class SinglyLinkedList
{
	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int nodeValue)
	{
		head =new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
}
