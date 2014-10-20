package CP4;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPazza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizaaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style Cheese Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York style Clam Pizza");

		}
		return pizza;
	}

}
