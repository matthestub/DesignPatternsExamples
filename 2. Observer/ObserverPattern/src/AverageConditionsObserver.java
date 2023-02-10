import java.util.ArrayList;
import java.util.List;

public class AverageConditionsObserver implements MyObserver {

    int temp;
    int humid;

    List<Integer> avgTemp;
    List<Integer> avgHumid;


    AverageConditionsObserver(WeatherStation station) {
        station.addObserver(this);
        avgTemp = new ArrayList<>();
        avgHumid = new ArrayList<>();
    }

    @Override
    public void update(int val1, int val2) {
        avgTemp.add(val1);
        avgHumid.add(val2);
    }

    void displayAverageConditions() {
        int averageTemperature = 0;
        int averageHumidity = 0;

        for (int t : avgTemp) {
            averageTemperature+=t;
        }

        for (int h : avgHumid) {
            averageHumidity+=h;
        }

        System.out.println("Average temp: "+averageTemperature/avgTemp.size());
        System.out.println("Average humid: "+averageHumidity/avgHumid.size());
    }
}
