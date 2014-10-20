package CP4;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Clams clam;

	abstract void prepare();

	void bake() {

	}

	void cut() {

	}

	void box() {

	}

	public void setName(String name) {
		this.name = name;
	}

}
