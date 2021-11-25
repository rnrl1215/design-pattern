package patterns.abstractfacotry.car;

public interface CarFactory {
    public Body createBody();
    public Wheel createWheel();
    public Engine createEngine();
}
