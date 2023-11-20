package observer;

public class ColdObserver implements IObserver{
    @Override
    public void update(int temp) {
            if (temp < 10) {
                System.out.println("Temperatura più bassa di 10");
            }
    }

}
