package launcher;

import model.File;
import model.Folder;

public class FileSizeCounterMain {
    public static void main(String[] args) {
        // Cerate files
        File file1 = new File("text1.txt", 10);
        File file2 = new File("text2.txt", 20);
        File file3 = new File("text3.txt", 30);
        File file4 = new File("text4.txt", 40);

        // Create a directory
        Folder directory = new Folder("dir1.dir", 10);
        directory.addFile(file1);
        directory.addFile(file2);
        directory.addFile(file3);

        // Create a subdirectory
        Folder subdirectory = new Folder("subdir1.subdir", 10);
        subdirectory.addFile(file4);
        directory.addFile(subdirectory);

        System.out.println(directory.getInformation());
        System.out.println("-------------------");
        System.out.println(subdirectory.getInformation());



    }
}
