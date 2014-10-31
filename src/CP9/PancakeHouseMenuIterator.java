package CP9;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList<?> menuItems;
	int menuPos;
	MenuItem currentItem;

	/**
	 * @param menuItems
	 */
	public PancakeHouseMenuIterator(ArrayList<?> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (menuItems.size() > menuPos) {
			currentItem = (MenuItem) menuItems.get(menuPos);
			return currentItem != null;
		}
		return false;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			menuPos++;
		}
		return currentItem;
	}

}
