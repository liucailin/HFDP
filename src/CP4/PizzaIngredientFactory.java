package CP4;

public interface PizzaIngredientFactory {
	public Dough createDouch();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Clams createClam();
}
