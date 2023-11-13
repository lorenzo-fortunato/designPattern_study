package model;

public class File implements Property{
    private String fileName;
    private int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getInformation() {
        return "Filename: " + this.fileName + " Size: " + this.getSize() + "\t";
    }
}
