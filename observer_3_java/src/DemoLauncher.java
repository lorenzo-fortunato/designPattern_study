import observer.EmailNotificationListener;
import observer.LogOpenListener;

public class DemoLauncher {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/gile.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // il ragionamento è un po' più incartato rispetto agli altri esempi fatti perchè qui si sta utilizzando un Map<String, List<IEventListener>>
    }
}
