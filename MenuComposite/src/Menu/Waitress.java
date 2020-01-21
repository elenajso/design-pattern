package Menu;

import java.util.Iterator;

public class Waitress {
	MenuComponent menu;

	public Waitress(MenuComponent allMenus) {
		menu=allMenus;
	}
	
	public void printVegMenu(){
		Iterator<MenuComponent> iter = menu.createIterator();
		while(iter.hasNext()){
			MenuComponent compo=iter.next();
			System.out.println(iter.next().getName());
			try{
			if (compo.isVeg()){
				compo.print();				}
		}
		catch(UnsupportedOperationException e){
		}
		}
	}

	public void printMenu() {
	menu.print();
		
	}
	


}
