package adapter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.StringReader;

public class XmlToJsonAdapter {

    public JsonParser transformXmlElement(Element rootElement) throws IOException {
        StringBuilder builder = new StringBuilder(" { ");

        NodeList childNodes = rootElement.getChildNodes();
        for(int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                Element childElement = (Element) childNode;
                String tagName = childElement.getTagName(); // property
                String textContent = childElement.getTextContent(); // value
                builder.append('"').append(tagName).append('"').append(":\"").append(textContent).append("\"");
                if (i < childNodes.getLength() - 2) {
                    builder.append(", ");
                }

            }
        }

        String jsonRepresentation = builder.append(" } ").toString();
        System.out.println(jsonRepresentation);
        return new JsonFactory().createParser(new StringReader(jsonRepresentation));
    }
}
