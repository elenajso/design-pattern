package menus;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
	private MenuItem[] items;
	private int pointer;
	
	public ArrayIterator(MenuItem[] menuItems) {
		this.items=menuItems;
		pointer=0;
	}

	public boolean hasNaxt() {
		return (items.length>pointer);
	}

	@Override
	public MenuItem next() {
		pointer++;
		return items[pointer-1];
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

}
