package lr10;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

import org.w3c.dom.*;
public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory= DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder=docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            //root element creation
            Element rootElement = doc.createElement("Library");
            doc.appendChild(rootElement);
            //First Book
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);
            
            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);
            
            Element author1= doc.createElement("author");
            author1.appendChild(doc.createTextNode("Л. Н. Толстой"));
            book1.appendChild(author1);

            Element year1 =doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);
            //Second Book

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);
            
            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);
            
            Element author2= doc.createElement("author");
            author2.appendChild(doc.createTextNode("М.А. Булгаков"));
            book2.appendChild(author2);

            Element year2 =doc.createElement("year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);
            addBook(doc, rootElement);
            // Write to XML
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
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
            System.out.println("File created!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void addBook(Document doc, Element rootElement) {
        Element book = doc.createElement("book");
        rootElement.appendChild(book);
        Element title = doc.createElement("title");
        System.out.println("Enter book title: ");
        Scanner input =new Scanner(System.in);
        title.appendChild(doc.createTextNode(input.nextLine()));
        book.appendChild(title);
        Element author= doc.createElement("author");
        System.out.println("Enter author: ");
        author.appendChild(doc.createTextNode(input.nextLine()));
        book.appendChild(author);
        Element year =doc.createElement("year");
        System.out.println("Enter year: ");
        year.appendChild(doc.createTextNode(input.nextLine()));
        book.appendChild(year);
        input.close();
    }
}
