package CP4;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing... " + name);
		dough = ingredientFactory.createDouch();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
