package CP9;

import java.util.Iterator;

public class Waitress {

	/*
	 * Menu dinnerMenu; Menu houseMenu;
	 * 
	 * public Waitress(Menu houseMenu, Menu dinnerMenu) { this.houseMenu =
	 * houseMenu; this.dinnerMenu = dinnerMenu; }
	 * 
	 * public void printMenu() { printMenu(houseMenu.createIterator());
	 * printMenu(dinnerMenu.createIterator()); }
	 * 
	 * private void printMenu(Iterator iterator) { while (iterator.hasNext()) {
	 * MenuItem item = (MenuItem) iterator.next();
	 * System.out.println(item.name); System.out.println(item.description);
	 * System.out.println(item.vegetarian); System.out.println(item.price); } }
	 */

	MenuComponent menuComponent;

	/**
	 * @param menuComponent
	 */
	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}

	public void printMenu() {
		menuComponent.print();
	}

	public void printVegMenu() {
		System.out.println("\nVEGETARIAN MENU\n----");
		Iterator<MenuComponent> iterator = menuComponent.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
			}

		}
	}
}
