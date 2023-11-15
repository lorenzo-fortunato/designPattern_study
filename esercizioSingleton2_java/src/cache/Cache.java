package cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Cache instance;
    private Map<String, Object> cache;

    private Cache() {
        this.cache = new HashMap<>();
    }

    public synchronized void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    public synchronized Object getFromCache(String key) {
        return cache.get(key);
    }

    public synchronized boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    public synchronized void removeFromCache(String key) {
        cache.remove(key);
    }

    public static synchronized Cache getInstance() {       // se hai più thread che vogliono usare il singleton nello stesso momento con synchronized in questa posizione li obblighi ad usarlo un thread per volta
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }
}
