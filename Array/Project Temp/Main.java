import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Temperature t = new Temperature();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many days Temperature? ");
		int days = scan.nextInt();
		t.getDays(days);
		t.getTemp();
		t.average();
		System.out.println("Temperatures above average");
		t.tempAboveAverage();
	}
}