package headfirst.patterns.observer.wheather;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // 객체를 주입 받아 현재 디스플레이를 옵버로 등록한다.
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println("현재 상태: 온도 "+temperature+" F, 습도 "+humidity+"%");
    }
}