import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherStation station = new WeatherStation();
        CurrentConditionsObserver currentConditionsObserver = new CurrentConditionsObserver(station);
        AverageConditionsObserver averageConditionsObserver = new AverageConditionsObserver(station);

        for (int i = 1; i <= 7; i++) {

            System.out.println("--- MEASUREMENT NO. "+i+" ---");

            int currentTemp = getRandomInt(-45, 45);
            int currentHumid = getRandomInt(0, 100);

            station.changeMeasurement(currentTemp, currentHumid);

            currentConditionsObserver.displayCurrentConditions();
            averageConditionsObserver.displayAverageConditions();

            Thread.sleep(2000);
        }

    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max+1 - min) + min;
    }

}
