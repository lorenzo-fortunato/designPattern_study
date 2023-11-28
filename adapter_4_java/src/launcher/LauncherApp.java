package launcher;

import adapter.SocketAdapter;
import adapter.SocketClassAdapterImpl;
import adapter.SocketObjectAdapterImpl;
import items.Volt;

public class LauncherApp {
    public static void main(String[] args) {
        testClassAdapter();
        System.out.println("----------------------------------------");
        testObjectAdapter();
    }

    private static void testObjectAdapter() {  // -> object adapter
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3 volts using Object Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Object Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Object Adapter = " + v120.getVolts());
    }

    private static void testClassAdapter() {  // -> class adapter
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3 volts using Class Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }
}
