package study.patterns.strategy;

public class Drum implements Instrument{
    @Override
    public void play() {
        System.out.println("play drum");
    }
}
