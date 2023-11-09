package wheaterChannel;

// this is also call observer or subscriber
public class TemperatureDisplay implements Subscriber{
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: The current temperature is " + temperature);
    }
}
