import CP9.DinnerMenu;
import CP9.PancakeHouseMenu;
import CP9.Waitress;

public class MenuTestDirver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PancakeHouseMenu houseMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		Waitress waitress = new Waitress(houseMenu, dinnerMenu);

		waitress.printMenu();
	}

}
