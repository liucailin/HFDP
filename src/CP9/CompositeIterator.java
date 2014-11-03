package CP9;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		else {
			Iterator<MenuComponent> peek = stack.peek();
			if (!peek.hasNext()) {
				stack.pop();
				return hasNext();
			}
			return true;
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> peek = stack.peek();
			MenuComponent next = peek.next();
			if (next instanceof Menu) {
				stack.push(next.createIterator());
			}
			return next;
		}
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();

	}

}
