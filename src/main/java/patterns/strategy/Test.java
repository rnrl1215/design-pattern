package patterns.strategy;

public class Test {

    public static void main(String[] args) {
        User user = new User();

        user.play();

        Drum drum = new Drum();
        BassGuitar bassGuitar = new BassGuitar();

        user.setInstrument(drum);
        user.play();

        user.setInstrument(bassGuitar);
        user.play();
    }
}
