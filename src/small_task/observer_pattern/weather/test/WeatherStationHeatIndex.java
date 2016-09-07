package small_task.observer_pattern.weather.test;

import small_task.observer_pattern.weather.observers.CurrentConditionsDisplay;
import small_task.observer_pattern.weather.observers.ForecastDisplay;
import small_task.observer_pattern.weather.observers.HeatIndexDisplay;
import small_task.observer_pattern.weather.observers.StatisticsDisplay;
import small_task.observer_pattern.weather.subjects.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
