package CP4;

public abstract class PizzaStore {

	public void orderPizza(String type) {

		Pizza pizza = createPazza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	abstract Pizza createPazza(String type);

}
