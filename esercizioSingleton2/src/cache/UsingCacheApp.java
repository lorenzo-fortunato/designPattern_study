package cache;

public class UsingCacheApp {
    public static void main(String[] args) {
        Cache cache = Cache.getInstance();

        cache.addToCache("idea", "Singleton is needed");
        cache = Cache.getInstance();
        cache.addToCache("hello", "Hey people");
        cache = Cache.getInstance();
        System.out.println(cache.getFromCache("idea"));
        System.out.println(cache.getFromCache("hello"));


    }
}
