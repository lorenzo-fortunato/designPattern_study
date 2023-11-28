package wheaterChannel;

import java.util.ArrayList;
import java.util.List;

// Publisher or Notifier
public class WeatherStation implements Publisher{
    private int temperature;
    private List<Subscriber> subscribers;

    public WeatherStation() {
        this.subscribers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(temperature);
        }
    }
}
