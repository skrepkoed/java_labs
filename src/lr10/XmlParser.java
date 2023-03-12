package lr10;
import java.io.File;
import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
public class XmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr10/example.xml"); 
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент "+doc.getDocumentElement().getNodeName());
            NodeList nodeList=doc.getElementsByTagName("book");
            for(int i=0; i<nodeList.getLength();i++){
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент "+node.getNodeName());
                if (node.getNodeType()==Node.ELEMENT_NODE) {
                    Element element =(Element) node;
                    System.out.println("Название книги: "+
                    element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: "+ 
                    element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания "+
                        element.getElementsByTagName("year").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
