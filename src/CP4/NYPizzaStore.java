package CP4;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPazza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new NYClamPizza();
		}
		return pizza;
	}

}
