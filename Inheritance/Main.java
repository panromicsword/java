import java.lang.*;
import java.util.*;

class Parent
{
	int data;
	String name="Parent";
	Parent()
	{
		this.data = 20;
	}

	void getDetails()
	{
		System.out.println("Parent Details - "+name+" "+data);
	}

}
class Child extends Parent
{
	String name = "child";
	Child()
	{
		super();
	}

	void getDetails()
	{
		System.out.println("Child Details - "+name+" "+data);
		super.getDetails();
	}
}

class Main
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.getDetails();
	}
}