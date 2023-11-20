package singletonNotifier;

import observer.IObserver;
import observer.HotObserver;

import java.util.ArrayList;
import java.util.List;

public class LocalitySingletonNotifier {
    private static LocalitySingletonNotifier instance;
    private int finalTemp;
    List<IObserver> observerList = new ArrayList<IObserver>();

    private LocalitySingletonNotifier() {

    }

    public static LocalitySingletonNotifier getInstance() {
        if (instance == null) {
            instance = new LocalitySingletonNotifier();
        }
        return instance;
    }

    public void setFinalTemperature(int actualTemp) {
        this.finalTemp = actualTemp;
        for (IObserver observer : observerList) {
            observer.update(actualTemp);
        }
    }

    public int getFinalTemperature() {
        return finalTemp;
    }

    public void subscribe(IObserver observer) {
        observerList.add(observer);
    }

    public void unsubscribe(HotObserver observer) {
        observerList.remove(observer);
    }
}
