package headfirst.patterns.observer;

import headfirst.patterns.observer.wheather.CurrentConditionsDisplay;
import headfirst.patterns.observer.wheather.StatisticsDisplay;
import headfirst.patterns.observer.wheather.WeatherData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {



    @Test
    void test() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay
                 = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay
                = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);

        float maxTemp = statisticsDisplay.getMaxTemp();
        float temperature = currentDisplay.getTemperature();

        Assertions.assertEquals(maxTemp,82.0);
        Assertions.assertEquals(temperature,78.0);

    }
}
