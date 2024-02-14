import java.lang.*;
import java.util.*;

class Insert
{
	int[][] nums = new int[3][2];
	int i,j;
	Insert()
	{
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[0].length;j++)
			{
				nums[i][j]=Integer.MIN_VALUE;
			}	
		}
	}

	public void printing()
	{
		for(i=0;i<nums.length;i++)
		{
			System.out.println(Arrays.toString(nums[i]));
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

	// Accessing the cells in the array

	public void accessElements(int r,int c)
	{
		try{
			System.out.println(nums[r][c]+" is present in the index of nums["+r+"]"+"["+c+"]");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid data");
		}
	}

	// Traversing the 2D array

	public void traversal()
	{
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[0].length;j++)
			{
				System.out.println("Element at index nums["+i+"]["+j+"] - "+nums[i][j]);
			}
		}
	}

	// Searching 2D arrays

	public void search(int s)
	{
		boolean check = false;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[0].length;j++)
			{
				if(nums[i][j]==s)
				{
					System.out.println("Element is present in index nums["+i+"]["+j+"]");
					System.out.println("Row - "+i);
					System.out.println("Column - "+j);
					check = true;	
				}
			}
		}
		if(check == false)
		{
			System.out.println("Element is not present in the array");
		}
	}

	public void delete(int value)
	{
		boolean status = false;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[0].length;j++)
			{
				if(nums[i][j]==value)
				{
					nums[i][j]=Integer.MIN_VALUE;
					System.out.println("Elements is present in the index of nums["+i+"]["+j+"] & Deleted Successfully ");
					status = true;
				}
			}
		}
		if(status == false)
		{
			System.out.println("Elements is not present in the array");
		}
	}
}