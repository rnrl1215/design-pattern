package patterns.abstractfacotry.car;

public interface CarFactory {
    public Body createFrame();
    public Wheel createWheel();
    public Engine createEngine();
}
