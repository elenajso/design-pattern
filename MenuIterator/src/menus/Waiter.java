package menus;
import java.util.ArrayList;
import java.util.Iterator;

public class Waiter {
//	private Menu pmenu;
//	private Menu dmenu;
//	private Menu cmenu;
	private ArrayList<Menu> menus;
	
	
	public Waiter(ArrayList<Menu> menus){ //arraylist�� ����������� �ʱ�ȭ�� ��
		this.menus=menus;
	}
	
//	public Waiter(Menu pmenu, Menu dmenu, Menu cmenu) {
//		this.pmenu=pmenu;
//		this.dmenu=dmenu;
//		this.cmenu=cmenu;
//	}

	public void printMenu(Iterator<MenuItem> iter){ //���׸� ���
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
		//TODO dmenu ���ͷ����� ����
		
		ArrayList<Iterator> mIter=new ArrayList();
		for(Menu m:menus){
//			Iterator iter=m.getIterator();
//			mIter.add(iter);
			//�����׸��� ��Ģ�� ���ؼ� Iterator �����
			mIter.add(m.getIterator());
		//	printVegMenu(m.getIterator());//���� ������
			
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
			//�����׸��� ��Ģ�� ���ؼ� Iterator �����
			mIter.add(m.getIterator());
		//	printVegMenu(m.getIterator());//���� ������
			
		}
		
		for(Iterator iter:mIter){
			printVegMenu(iter);
		}
	}
}
	
