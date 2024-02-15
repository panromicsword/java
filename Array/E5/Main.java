import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])	
	{
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices)
	{
		int b,s;
		int Fprofit =0;
		for(b=0;b<prices.length;b++)
		{
			for(s=b+1;s<prices.length;s++)
			{
				int Lprofit = prices[s]-prices[b];
				if(Lprofit>Fprofit)
				{
					Fprofit=Lprofit;
				}
			}
		}
		return Fprofit;
	}
}