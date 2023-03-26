package lr10;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
            System.out.println("Results:");
            printBook(searchBook(doc, "year", "1967"));
            deleteBook(doc, "year", "1967");
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static ArrayList<Node> searchBook(Document doc,String attr, String value) {
       NodeList booklist= doc.getElementsByTagName("book");
       ArrayList<Node> searchResult=new  ArrayList<Node>();
       for(int i=0; i<booklist.getLength();i++){
            Node book =booklist.item(i);
            HashMap<String,String>bookHash=new HashMap<String,String>();
            for (int k =0; k<book.getChildNodes().getLength();k++) {
                bookHash.put(book.getChildNodes().item(k).getNodeName(),book.getChildNodes().item(k).getTextContent());
            }
            if (bookHash.get(attr).equals(value)) {
                searchResult.add(book);    
            }
       }
       return searchResult;
    }

    public static void deleteBook(Document doc,String attr, String value) {
        for(Node node: searchBook(doc, attr, value)){
            
            node.getParentNode().removeChild(node);
            
        }
        try {
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "true");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source =new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = 
            new javax.xml.transform.stream.StreamResult(
                new File ("src/lr10/example.xml")); 

            transformer.transform(source, result);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static void printBook(ArrayList<Node> nodeList) {
        if (nodeList.size()==0) {
            System.out.println("There is no such book");
        }else{
        for(int i=0; i<nodeList.size();i++){
            Node node = nodeList.get(i);
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
    }
    }
}
