public class CurrentConditionsObserver implements MyObserver {

    int temp;
    int humid;

    CurrentConditionsObserver(WeatherStation weatherStation) {
        weatherStation.addObserver(this);
    }

    @Override
    public void update(int val1, int val2) {
        this.temp = val1;
        this. humid = val2;
    }

    void displayCurrentConditions() {
        System.out.println("Current temp: "+temp);
        System.out.println("Current humidity: "+humid);
    }

}
