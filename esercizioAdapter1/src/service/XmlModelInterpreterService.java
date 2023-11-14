package service;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class XmlModelInterpreterService {
    public void parse(Element rootElement) {
        NodeList childNodes = rootElement.getChildNodes();
        for(int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                Element childElement = (Element) childNode;
                String tagName = childElement.getTagName();
                String textContent = childElement.getTextContent();
                System.out.println("Element: " + tagName + ", Text: " + textContent);
            }
        }
    }
}
