import java.util.Observer;

public interface Subject {

    void addObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyObservers();

}
