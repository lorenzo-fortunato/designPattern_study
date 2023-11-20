package observer;

public class HotObserver implements IObserver{
    @Override
    public void update(int temp) {
        if (temp > 10) {
            System.out.println("Temperatura più alta di 10");
        }
    }

}
