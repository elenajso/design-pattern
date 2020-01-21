package menus;

import java.util.ArrayList;

public class MenuTestDrive {

	public MenuTestDrive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Menu pmenu = new PancakeHouseMenu();
		Menu dmenu=new DinerMenu();
		
	//	Waiter waiter = new Waiter(pmenu, dmenu, new CafeMenu);
		ArrayList<Menu> menus=new ArrayList();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());
		Waiter waiter=new Waiter(menus);
		waiter.printAllMenu();
		
		System.out.println("채식메뉴");
		waiter.printAllVegMenu();

	}

}
