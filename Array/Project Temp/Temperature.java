import java.lang.*;
import java.util.*;

class Temperature
{
    private Scanner scan;
    private int size;
    private int[] temps;
    private double avg;
    int sum=0;
    int i;
    public void getDays(int days)
    {
        this.size = days;
        this.temps = new int[size];
        this.scan = new Scanner(System.in);
    }
    
    public void getTemp()
    {
        System.out.println("Enter the Temperatures");
        for(i=0;i<size;i++)
        {
            this.temps[i] = scan.nextInt();
        }
    }

    public void average()
    {
        for(i=0;i<size;i++)
        {
            sum = sum+temps[i];
        }

        this.avg = sum/size;
    }

    public void tempAboveAverage()
    {
        for(i=0;i<size;i++)
        {
            if(temps[i]>avg)
            {
            System.out.print(temps[i]+" ");
            }
        }
    }
}