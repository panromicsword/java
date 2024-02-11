import java.lang.*;
import java.util.*;

class Complexities
{
	public static void main(String args[])
	{
		int n;
		int total = 0;
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					for(l=0;l<n;l++)
					{
						for(m=0;m<n;m++)
						{
							total++;
						}
					}
				}
			}
		}
		System.out.println(total);
	}
}
