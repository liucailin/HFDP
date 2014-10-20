package CP4;

public class NYPizaaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDouch() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Gralic(), new Onlion() };
		return veggies;
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
