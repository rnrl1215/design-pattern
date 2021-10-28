package patterns.strategy;

public class BassGuitar implements Instrument{
    @Override
    public void play() {
        System.out.println("play bass guitar");
    }
}
