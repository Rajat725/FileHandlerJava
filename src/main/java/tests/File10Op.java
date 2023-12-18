package tests;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class File10Op {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final Document document = documentBuilder.parse(".\\Data\\Books.xml");


        final Element root = document.getDocumentElement();
        System.out.println("Root NAme is " + root.getNodeName());
        final NodeList book = root.getElementsByTagName("book");
        for (int i = 0; i < book.getLength(); i++) {
            final Node bookNode = book.item(i);
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {

                final Element bookNode1 = (Element) bookNode;
                final String author = bookNode1.getElementsByTagName("author").item(0).getTextContent();
                final String title = bookNode1.getElementsByTagName("title").item(0).getTextContent();
                final String genre = bookNode1.getElementsByTagName("genre").item(0).getTextContent();
                final String price = bookNode1.getElementsByTagName("price").item(0).getTextContent();
                final String publish_date = bookNode1.getElementsByTagName("publish_date").item(0).getTextContent();
                final String description = bookNode1.getElementsByTagName("description").item(0).getTextContent();
                System.out.println("Author :: " + author);
                System.out.println("title :: " + title);
                System.out.println("genre :: " + genre);
                System.out.println("price :: " + price);
                System.out.println("publish_date :: " + publish_date);
                System.out.println("descriptions :: " + description);

            }


        }


    }
}
