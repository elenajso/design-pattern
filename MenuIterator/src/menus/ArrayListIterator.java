package menus;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator implements Iterator {
	private ArrayList<MenuItem> items;
	private int pointer;
	
	
	public ArrayListIterator(ArrayList menuItems) {
		this.items=menuItems;
		pointer=0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (items.size() > pointer);
	}

	@Override
	public MenuItem next() {
		MenuItem result;
		result = items.get(pointer);
		pointer++;
		return result;
	}

}
