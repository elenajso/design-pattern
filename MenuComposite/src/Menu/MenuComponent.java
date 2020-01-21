package Menu;

import java.util.Iterator;

public abstract class MenuComponent {
	//source Ȱ�� ���ϱ�
	public abstract String getName();
	public abstract String getDescription();

	public abstract void print();
	
	public  void add(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVeg(){
		return true;
	}
	
	public MenuComponent getChild(int i){//i��° ���ϵ带 �����ö� ����
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
		
	
}
