package generics.containers;

import java.util.ArrayList;

import generics.Item;

public abstract class Container<T extends Item> extends Item {
	// collection of items
	private ArrayList<T> items = new ArrayList<>();
	
	// add item to arraylist
	public void add(T item) {
		items.add(item);
	}

	// just a getter
	public ArrayList<T> getItems() {
		return items;
	}
}
