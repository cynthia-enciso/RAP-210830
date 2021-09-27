package constructors;

public class Book {
	// fields
	private String title;
	private String author;
	private int pageNumber;
	
	// constructor
	public Book() {
		this.title = "Generic Book";
		this.author = "Generic Author";
		this.pageNumber = 0;
		System.out.println("Some other setting up");
	}
	
	public Book(String title) {
		this.title = title;
		this.author = "Generic Author";
		this.pageNumber = 0;
		System.out.println("Some other setting up");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.pageNumber = 0;
		System.out.println("Some other setting up");
	}
	
	public Book(String title, String author, int pageNumber) {
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
		System.out.println("Some other setting up");
	}
	
	
	// getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	
}
