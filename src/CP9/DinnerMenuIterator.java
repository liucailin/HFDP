package CP9;

public class DinnerMenuIterator implements Iterator {

	MenuItem[] menuItems;
	int menuPos;

	/**
	 * @param menuItems
	 */
	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return menuItems.length > menuPos && menuItems[menuPos] != null;
	}

	@Override
	public Object next() {
		MenuItem item = null;
		if (hasNext()) {
			item = menuItems[menuPos];
			menuPos++;
		}
		return item;

	}
}
