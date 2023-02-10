import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<MyObserver> observers;
    int temp;
    int humidity;

    WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {

        if (observers.indexOf(o) >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temp, humidity));
    }

    public void changeMeasurement(int t, int h) {
        this.temp = t;
        this.humidity = h;
        notifyObservers();
    }

}
