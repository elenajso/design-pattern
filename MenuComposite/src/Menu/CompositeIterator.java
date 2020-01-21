package Menu;
import java.util.*;
  
public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);//allmenus의 iterator 을 불러옴 그 후 넥스트와 해즈넥스트(내 안에 속해있는것)를 조작
	}//스택에 자식들의 이터레이터까지 저장해서 불러옴
   
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();//peek 맨위에있는거 들여다보기 가져오는게 아님 popX
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext(); //여기에 세모세모세모가 팝되고 그 위에있는 동그라미가 팝됨
			} else {
				return true;
			}
		}
	}
	
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


