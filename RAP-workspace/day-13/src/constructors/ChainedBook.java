package constructors;

import java.util.Arrays;

public class ChainedBook {
	// fields
	private String title;
	private String author;
	private int pageNumber;
	
	// constructor
	public ChainedBook() {
		this("Default title", "Default author", 0);
		
	}
	
	public ChainedBook(String title) {
		this(title, "Default author", 0);
	}
	
	public ChainedBook(String title, String author) {
		this(title, author, 0);
	}
	
	public ChainedBook(String title, String author, int pageNumber) {
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
		System.out.println("Some other setting up");
	}
	
	// does unrelated stuff
	public ChainedBook(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int result = Arrays.binarySearch(array, 3);
		System.out.println("was it found? " + result);
//		for (int element : array) {
//			System.out.println(element);
//		}
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
