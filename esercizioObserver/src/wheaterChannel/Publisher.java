package wheaterChannel;

public interface Publisher {
    void addObserver(Subscriber subscriber);

    void removeObserver(Subscriber observer);

    void notifyObservers();
}
