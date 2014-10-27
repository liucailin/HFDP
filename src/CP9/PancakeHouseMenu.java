package CP9;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("K&B��s Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", false, 2.99);
	}

	public void addItem(String name, String descr, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, descr, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}

}