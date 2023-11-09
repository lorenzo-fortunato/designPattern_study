package domain;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory: Loading data at position " + position);
    }

    public void dump() {
        System.out.println("Dump all memory");
    }
}
