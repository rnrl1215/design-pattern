package headfirst.patterns.observer.wheather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
