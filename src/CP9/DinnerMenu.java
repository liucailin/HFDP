package CP9;

public class DinnerMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItem;
	MenuItem[] menuItems;
	DinnerMenuIterator dinnerMenuIterator;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("K&B¡¯s Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", false, 2.99);

		dinnerMenuIterator = new DinnerMenuIterator(menuItems);
	}

	public void addItem(String name, String descr, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, descr, vegetarian, price);
		if (numberOfItem >= MAX_ITEMS)
			System.err.println("menu is full");
		menuItems[numberOfItem] = menuItem;
		numberOfItem++;
	}

	public Iterator crateIterator() {
		return dinnerMenuIterator;
	}

}
