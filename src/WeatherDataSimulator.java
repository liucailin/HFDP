import CP2.CurrentConditionsDisplay;
import CP2.WeatherData;

public class WeatherDataSimulator {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(25, 10, 390);

	}

}
