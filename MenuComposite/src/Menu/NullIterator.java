package Menu;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false; //���Ⱑ false���� Ȯ��
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

}
