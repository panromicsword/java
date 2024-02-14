import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		int[][] array = {{1,2,3,4},{4,5,6,4},{7,8,9,4},{1,1,1,3}};
		System.out.println(sumOfDiagonal(array));
	}

	public static int sumOfDiagonal(int[][] array)
	{
		int sum=0;
		int i,j;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array[0].length;j++)
			{
				if(i==j)
				{
					sum = sum+array[i][j];
				}
			}
		}
		return sum;
	}
}