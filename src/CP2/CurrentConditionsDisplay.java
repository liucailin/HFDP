package CP2;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer,
		DisplayElement {

	private Observable weatherDate;
	private float temp;
	private Object humidity;

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherDate = weatherData;
		this.weatherDate.addObserver(this);
	}

	@Override
	public void Display() {
		System.out.println("The current weather condition: \ntemperatur "
				+ temp + "\nhunidity " + humidity);
	}

	@Override
	public void update(Observable obs, Object data) {
		if (obs instanceof WeatherData) {
			temp = ((WeatherData) obs).getTemperature();
			humidity = ((WeatherData) obs).getHumidity();
			Display();
		}
	}
}
