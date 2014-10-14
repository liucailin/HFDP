package CP2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Subject weatherDate;
	private float temp;
	private Object humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherDate = weatherData;
		this.weatherDate.registerObserver(this);
	}

	@Override
	public void Display() {
		System.out.println("The current weather condition: \ntemperatur "
				+ temp + "\nhunidity " + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		Display();
	}
}
