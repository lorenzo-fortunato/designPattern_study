package adapter;

import items.Socket;
import items.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter{

    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    @Override
    public Volt convertVolt(Volt volt, int number) {
        int amountOfVolts = volt.getVolts() / number;
        Volt newVolt = new Volt(amountOfVolts);
        return newVolt;
    }
}
