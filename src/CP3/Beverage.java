package CP3;

public abstract class Beverage {
	
	String description;
	
	public abstract double cost();
	
	private String getDescription() {
		return description;
	}

}
