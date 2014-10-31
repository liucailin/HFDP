import CP9.Menu;
import CP9.MenuComponent;
import CP9.MenuItem;
import CP9.Waitress;

public class MenuTestDirver {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { PancakeHouseMenu houseMenu = new
	 * PancakeHouseMenu(); DinnerMenu dinnerMenu = new DinnerMenu(); Waitress
	 * waitress = new Waitress(houseMenu, dinnerMenu);
	 * 
	 * waitress.printMenu(); }
	 */

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
				"Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"Dessert of course!");
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.addComponent(pancakeHouseMenu);
		allMenus.addComponent(dinerMenu);
		allMenus.addComponent(cafeMenu);
		// add menu items here
		dinerMenu
				.addComponent(new MenuItem(
						"Pasta",
						"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
						true, 3.89));
		dinerMenu.addComponent(dessertMenu);
		dessertMenu.addComponent(new MenuItem("Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla icecream",
				true, 1.59));
		// add more menu items here
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
