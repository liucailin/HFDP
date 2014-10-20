import CP4.NYPizzaStore;
import CP4.PizzaStore;

public class PizzaStoreTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
	}

}
