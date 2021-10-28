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

    public static void main(String[] args) {
        User user = new User();

        Drum drum = new Drum();
        BassGuitar bassGuitar = new BassGuitar();

        user.setInstrument(drum);
        user.play();

        user.setInstrument(bassGuitar);
        user.play();
    }
}
