package text;

public class MyDocument {
    private String name;

    public MyDocument(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening document: " + name);
    }

    public void save() {
        System.out.println("Saving document: " + name);
    }

    public void close() {
        System.out.println("Closing document: " + name);
    }
}
