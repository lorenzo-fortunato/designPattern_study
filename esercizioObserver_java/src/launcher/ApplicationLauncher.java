package launcher;

import wheaterChannel.TemperatureDisplay;
import wheaterChannel.WeatherStation;

public class ApplicationLauncher {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

        weatherStation.addObserver(temperatureDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        weatherStation.removeObserver(temperatureDisplay);

        weatherStation.setTemperature(22);

    }
}
