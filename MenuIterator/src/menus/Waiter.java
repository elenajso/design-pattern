package menus;
import java.util.ArrayList;
import java.util.Iterator;

public class Waiter {
//	private Menu pmenu;
//	private Menu dmenu;
//	private Menu cmenu;
	private ArrayList<Menu> menus;
	
	
	public Waiter(ArrayList<Menu> menus){ //arraylist를 던져줘야지만 초기화가 됨
		this.menus=menus;
	}
	
//	public Waiter(Menu pmenu, Menu dmenu, Menu cmenu) {
//		this.pmenu=pmenu;
//		this.dmenu=dmenu;
//		this.cmenu=cmenu;
//	}

	public void printMenu(Iterator<MenuItem> iter){ //제네릭 사용
		MenuItem item;
		
		while(iter.hasNext()){
			item=iter.next();
			System.out.println(item.getName()+"\n"+item.getDescription()+"\n"+item.getPrice());
		}
	}
	

	public void printAllMenu() {
//		Iterator pIter=pmenu.getIterator();
		//pmenu,getMenuItems.iterator();
//		Iterator dIter=dmenu.getIterator();
//		Iterator cIter=dmenu.getIterator();
		//TODO dmenu 이터레이터 구현
		
		ArrayList<Iterator> mIter=new ArrayList();
		for(Menu m:menus){
//			Iterator iter=m.getIterator();
//			mIter.add(iter);
			//데메테르의 법칙에 의해서 Iterator 숨기기
			mIter.add(m.getIterator());
		//	printVegMenu(m.getIterator());//양이 많을때
			
		}
		
		for(Iterator iter:mIter){
			printMenu(iter);
		}
//		printMenu(pIter);
//		printMenu(dIter);
//		printMenu(cIter);
		

	}

	private void printVegMenu(Iterator<MenuItem> iter) {
		// TODO Auto-generated method stub
		MenuItem item;
		while(iter.hasNext()){
			item=iter.next();
			if( item.isVegetarian()){
			System.out.println(item.getName()+"\n"+item.getDescription()+"\n"+item.getPrice());
		}
	}
	}

	public void printAllVegMenu() {
		// TODO Auto-generated method stub

		ArrayList<Iterator> mIter=new ArrayList();
		for(Menu m:menus){
//			Iterator iter=m.getIterator();
//			mIter.add(iter);
			//데메테르의 법칙에 의해서 Iterator 숨기기
			mIter.add(m.getIterator());
		//	printVegMenu(m.getIterator());//양이 많을때
			
		}
		
		for(Iterator iter:mIter){
			printVegMenu(iter);
		}
	}
}
	
