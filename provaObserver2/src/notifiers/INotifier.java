package notifiers;

import model.MoneyTransaction;
import observers.IObserver;

public interface INotifier<E> {
    void subscribe(E e);
    void unsubscribe(E e);

}
