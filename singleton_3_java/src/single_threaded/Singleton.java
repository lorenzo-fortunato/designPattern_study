//package single_threaded;
//
//public class Singleton {
//    private static Singleton instance;
//    public static String value;
//
//    private Singleton(String value) {
//        // the following code emulates slow initialization
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.value = value;
//    }
//
//    public static Singleton getInstance(String value) {
//        if (instance == null) {
//            instance = new Singleton(value);
//        }
//        return instance;
//    }
//
//    public static String getValue() {
//        return value;
//    }
//}
