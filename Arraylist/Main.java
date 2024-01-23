import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        //Here enter your limits:
        System.out.print("Enter the limit - ");
        int limit = scan.nextInt();
        int i;
        for (i=0;i<limit;i++)
        {
            int value;
            System.out.print("Add the value - ");
            value = scan.nextInt();
            x.add(value);
        }
        System.out.print("The new ArrayList is - ");
        System.out.print(x);
        //not required 
    }

}
