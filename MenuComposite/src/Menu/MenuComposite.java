package Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuComposite extends MenuComponent {
	private String name;
	private String description;
	private ArrayList<MenuComponent> menuComponents;
	
	public MenuComposite(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		
		menuComponents = new ArrayList<MenuComponent>();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}



	@Override
	public void print() {
		System.out.println("�޴� : "+ getName() );
		System.out.println("���� : "+ getDescription());
		System.out.println("-------------------------------");
		Iterator<MenuComponent> iter = menuComponents.iterator();
		while(iter.hasNext()){
			MenuComponent compo= iter.next();
			compo.print();
		}
	}
	
	@Override
	public void add(MenuComponent component) {
		// TODO Auto-generated method stub
		menuComponents.add(component);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return menuComponents.get(i);
	}
	
	//��¥ ��ȯ����ߵǴϱ� null���� �ڱ� �ؿ��ִ� �����۵��� ���������
	//create override �����ְڽ��ϴ� Ŭ��
	
	
	
	
	
	
	
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	

}
