package proxy;

import java.util.ArrayList;

public class MainLauncher {
    public static void main(String[] args) {
        ArrayList<Image> listOfImages = new ArrayList<Image>();
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));
        listOfImages.add(new ProxyImage("c://test"));

        for (Image image : listOfImages) {
            image.display();
        }
    }
}
