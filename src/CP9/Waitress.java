package CP9;

public class Waitress {

	DinnerMenu dinnerMenu;
	PancakeHouseMenu houseMenu;

	/**
	 * @param houseMenu
	 * @param dinnerMenu
	 */
	public Waitress(PancakeHouseMenu houseMenu, DinnerMenu dinnerMenu) {
		this.houseMenu = houseMenu;
		this.dinnerMenu = dinnerMenu;
	}

	public void printMenu() {
		printMenu(houseMenu.createIterator());
		printMenu(dinnerMenu.crateIterator());
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.name);
			System.out.println(item.description);
			System.out.println(item.vegetarian);
			System.out.println(item.price);
		}
	}

}
