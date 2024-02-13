import java.lang.*;
import java.util.*;

class Insert
{
	int[][] nums = new int[2][2];
	int i,j;
	Insert()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				nums[i][j]=Integer.MIN_VALUE;
			}	
		}
	}
	// Inserting elements in 2D array

	public void insertElements(int r,int c,int v)
	{
		try{
		if(nums[r][c]==Integer.MIN_VALUE)
		{
			nums[r][c]=v;
			System.out.println("Number is inserted");
		}
		else
		{
			System.out.println("This already contains value");
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter the valid Index");
		}
	}

	// Accessing the elements in the array

	public void accessElements(int r,int c,int v)
	{
		try{
		if(nums[r][c]==v)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid data");
		}
	}
}