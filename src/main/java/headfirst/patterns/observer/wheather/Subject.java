package headfirst.patterns.observer.wheather;

import java.awt.image.TileObserver;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
