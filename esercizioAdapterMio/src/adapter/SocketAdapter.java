package adapter;

import items.Volt;

public interface SocketAdapter {
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();
    public Volt convertVolt(Volt volt, int number);
}
