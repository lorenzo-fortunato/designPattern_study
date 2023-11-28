package multi_threaded;

public class Singleton2 {
    private static volatile Singleton2 instance;    // volatile fa si che il lock funzioni correttamente, facendo si che gli altri thread vedano sempre e solo i valori aggiornati di questo campo
    public static String value;

    private Singleton2(String value) {
        this.value = value;
    }

    public static Singleton2 getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        Singleton2 result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2(value);
            }
            return instance;
        }
    }

    public static String getValue() {
        return value;
    }
}

