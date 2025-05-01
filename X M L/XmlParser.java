import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlParser {
    public static void main(String[] args) {
        try {
            // Load XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("books.xml");

            // Normalize
            document.getDocumentElement().normalize();

            // Read data
            NodeList nodeList = document.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element book = (Element) node;
                    String title = book.getElementsByTagName("title").item(0).getTextContent();
                    String author = book.getElementsByTagName("author").item(0).getTextContent();
                    String year = book.getElementsByTagName("year").item(0).getTextContent();
                    String genre = book.getElementsByTagName("genre").item(0).getTextContent();

                    System.out.println("Title: " + title);
                    System.out.println("Author: " + author);
                    System.out.println("Year: " + year);
                    System.out.println("Genre: " + genre);
                    System.out.println("-----------");
                }
            }

            // Modify the year of the first book
            Element firstBook = (Element) nodeList.item(0);
            firstBook.getElementsByTagName("year").item(0).setTextContent("2023");

            // Save updated file
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("updated_books.xml"));
            transformer.transform(source, result);

            System.out.println("Updated first book year and saved to updated_books.xml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
