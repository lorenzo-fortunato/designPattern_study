package multi_threaded;

public class MultiThreadLauncher {
    public static void main(String[] args) {
        System.out.println("If you see the same value, the singleton was reused (yeee!!!)\n" +
                "If you see different values, then 2 singletons were created ( -.-' )\n" +
                "RESULT: " + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton = Singleton2.getInstance("FOO");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton2 = Singleton2.getInstance("FOO");
            System.out.println(singleton2.getValue());
        }
    }
}
