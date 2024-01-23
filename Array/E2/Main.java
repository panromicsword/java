import java.lang.*;

class Book
{
	String author;
	int pages;

	Book(String author,int pages)
	{
		this.author = author;
		this.pages = pages;
	}



}

class Main
{
	public static void main(String args[])
	{
		Book[] b = new Book[2];

		b[0]= new Book("A",20);
		b[1] = new Book("B",21);
	}
}