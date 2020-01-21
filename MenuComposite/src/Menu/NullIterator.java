package Menu;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false; //여기가 false인지 확인
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

}
