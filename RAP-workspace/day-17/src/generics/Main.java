package generics;

import generics.containers.CardboardBox;
import generics.containers.Tupperware;
import generics.food.Chips;
import generics.food.Food;
import generics.food.Sandwich;
import generics.tools.Notepad;
import generics.tools.Pencil;
import generics.tools.Tool;

public class Main {
	public static void main(String[] args) {
		// create box
		CardboardBox<Tool> box = new CardboardBox<>();
		box.add(new Notepad());
		box.add(new Pencil());
		
		// create tupperware
		Tupperware<Food> tupperware = new Tupperware<>();
		tupperware.add(new Sandwich());
		tupperware.add(new Chips());
		
		System.out.println("What does the user have in their cardboard box?");
		for (Tool item : box.getItems()) {
			System.out.println(item);
		}
		
		System.out.println("\nWhat does the user have in their tupperware?");
		for (Food item : tupperware.getItems()) {
			System.out.println(item);
		}
		
		take(tupperware.getItems().get(0));
	}
	
	public static <T extends Item> void take(T item) {
		System.out.println(item.getClass().getSimpleName() + " taken!");
	}
}
