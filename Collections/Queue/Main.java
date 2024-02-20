import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.add(2);
		System.out.println(q);
		System.out.println(q.peek());
	}
}