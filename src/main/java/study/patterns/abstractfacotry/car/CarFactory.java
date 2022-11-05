package study.patterns.abstractfacotry.car;

public interface CarFactory {
    public Frame createFrame();
    public Wheel createWheel();
    public Engine createEngine();
}
