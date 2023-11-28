import data.DataSource;
import data.FileDataSource;
import decorator.CompressionDecorator;
import decorator.DataSourceDecorator;
import decorator.EncryptionDecorator;

public class DemoLauncher {
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Smith, 100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input --------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        // le funzionalità aggiuntive sono state inserite nei decorator
        // ricorda che tutto parte dal wrappee (che è del tipo dell'oggetto da decorare), poi i metodi che ne derivano rimandano a quellli dell'oggetto da decorare con le dovute modifiche/aggiunte/sottrazioni
    }
}
