package model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File implements Property{

    private List<Property> fileList = new ArrayList<Property>();
    public Folder(String fileName, int size) {
        super(fileName, size);
    }

    public void addFile(Property fileToAdd) {
        fileList.add(fileToAdd);
    }

    @Override
    public int getSize() {
        int calculatedSIze = 0;
        for(Property file : fileList) {
            calculatedSIze += file.getSize();
        }
        return calculatedSIze;
    }

    @Override
    public String getInformation() {
        StringBuilder stringBuilder = new StringBuilder(super.getInformation());
        for(Property file : fileList) {
            stringBuilder.append(file.getInformation());
        }
        return "Directory-" + stringBuilder.toString();
    }
}
