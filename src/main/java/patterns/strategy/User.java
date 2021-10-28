package patterns.strategy;

public class User {
    private Instrument instrument;
    public void play(){
        if (instrument == null) {
            System.out.println("연주할수 있는 악기가 없습니다.");
        } else {
            instrument.play();
        }
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
