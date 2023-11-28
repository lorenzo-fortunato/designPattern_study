import factory.GUIAbstractFactory;
import factory.MacOSFactory;
import factory.WindowsFactory;


public class AppLauncher {
    public static void main(String[] args) {
        GUIAbstractFactory factory = getFactory();    // questo metodo controlla il sistema operativo che si sta utilizzando e si regola di conseguenza
        factory.createButton().paint();
        factory.createCheckbox().paint();
    }

    static GUIAbstractFactory getFactory() {
        GUIAbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("MacOS")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return factory;
    }


    // in alternativa si possono usare una stinga hardcoded o si possono definire gli args dell'applicazione, in questo modo però si svincola il comportamento dal tipo si SO presente sulla macchina in utilizzo
}
