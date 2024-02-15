import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Delete d = new Delete();
		System.out.println(Arrays.toString(d.arr));
		d.delete(3);
		System.out.println(Arrays.toString(d.arr));
		d.delete(4);
		System.out.println(Arrays.toString(d.arr));
		d.delete(5);
		System.out.println(Arrays.toString(d.arr));
		d.delete(6);
		System.out.println(Arrays.toString(d.arr));
	}
}