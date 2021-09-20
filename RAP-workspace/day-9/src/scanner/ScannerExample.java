package scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many items do you want?: ");
		int quantity = scanner.nextInt();
		
		Item[] inventory = new Item[quantity];
		
		for (int i = 0; i < inventory.length; i++) {
			System.out.println("What is item #"+ (i + 1) +"?");
			String type = scanner.next();
			Item currentItem = new Item(type);
			inventory[i] = currentItem;
		}
		
		for (int i = 0; i < inventory.length; i++) {
			System.out.println("Item: " + inventory[i].type);
		}
	}
}

class Item {
	String type;
	
	Item(String type) {
		this.type = type;
	}
}
