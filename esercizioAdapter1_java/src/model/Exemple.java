package model;


import adapter.XmlToJsonAdapter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import service.ModelInterpreterService;
import service.XmlModelInterpreterService;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Exemple {
    public static void main(String[] args) {
        try {
            Exemple instance = new Exemple();
            // Load XML file
            File xmlFile = new File("\\Users\\lfortunato\\Desktop\\eserciziCorsoDesignPattern\\esercizioAdapter1\\src\\model\\example.xml");

            // Unmarshall XML to Java object
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            // Access and display book details
            Element rootElement = document.getDocumentElement();
            XmlModelInterpreterService modelInterpreter = new XmlModelInterpreterService();
            //modelInterpreter.parse(rootElement);
            XmlToJsonAdapter adapter = new XmlToJsonAdapter();
            ModelInterpreterService service = new ModelInterpreterService();
            service.parse(adapter.transformXmlElement(rootElement));

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
