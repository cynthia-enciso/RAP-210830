package constructors;

import java.util.Arrays;

public class ReversedChainedBook {
	// fields
	private String title;
	private String author;
	private int pageNumber;
	
	// constructor
	public ReversedChainedBook() {
		this.title = "default title";
		this.author = "default author";
		this.pageNumber = 0;
	}
	
	public ReversedChainedBook(String title) {
		this();
		this.title = title;
	}
	
	public ReversedChainedBook(String title, String author) {
		this();
		this.title = title;
		this.author = author;
	}
	
	public ReversedChainedBook(String title, String author, int pageNumber) {
		this();
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
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
