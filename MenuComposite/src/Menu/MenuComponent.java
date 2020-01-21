package Menu;

import java.util.Iterator;

public abstract class MenuComponent {
	//source 활용 잘하기
	public abstract String getName();
	public abstract String getDescription();

	public abstract void print();
	
	public  void add(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVeg(){
		return true;
	}
	
	public MenuComponent getChild(int i){//i번째 차일드를 가져올때 유용
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
		
	
}
