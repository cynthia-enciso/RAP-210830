package constructors;

public class Main {
	public static void main(String[] args) {
		System.out.println("------------ PENS ---------------");
		WritingUtensil wu = new WritingUtensil();
		wu.write();
		Pen pen = new Pen();
		pen.write();
		
		System.out.println("------------ BOOKS ---------------");
		
		Book book1 = new Book();
		Book book2 = new Book("Jurassic Park");
		Book book3 = new Book("The Stand", "Stephen King");
		
		ChainedBook cb1 = new ChainedBook();
		ChainedBook cb2 = new ChainedBook("Jurassic Park");
		ChainedBook cb3 = new ChainedBook("The Stand", "Stephen King");
		ChainedBook cb4 = new ChainedBook(new int[] {4, 5, 8, 3, 5});
	}
}
