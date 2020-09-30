public class BibleBook 
{
	private String bookName;
	private int numOfChapters;
	private String summaryOfBook;
	
	public BibleBook(String bookName, int numOfChapters, String summaryOfBook)
	{
		this.bookName = bookName;
		this.numOfChapters = numOfChapters;
		this.summaryOfBook = summaryOfBook;
		
	}
	
	
	public void display()
	{
		System.out.println("Book:" + this.bookName + " , " + this.numOfChapters + " chapters," + " " + this.summaryOfBook);
	}
}
