package adapter;

import items.Socket;
import items.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    @Override
    public Volt convertVolt(Volt volt, int number) {
        int amountOfVolts = volt.getVolts() / number;
        Volt newVolt = new Volt(amountOfVolts);
        return newVolt;
    }
}
