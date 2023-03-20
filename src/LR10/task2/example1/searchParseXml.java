package LR10.task2.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class searchParseXml {

    public static void searchDevice(String ip, String name) {
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        try {
            File inputFile = new File("src/LR10/task2/example1/xmlTest.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);

            Node root = doc.getDocumentElement();
            Element element = doc.getDocumentElement();

            NodeList nodeList = root.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i ++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() != Node.TEXT_NODE) {
                    NodeList bookProps = node.getChildNodes();

                    for(int j = 0; j < bookProps.getLength(); j++) {
                        Node bookProp = bookProps.item(j);
                        // Если нода не текст, то это один из параметров книги - печатаем
                        if (bookProp.getNodeType() != Node.TEXT_NODE) {
                           if (bookProp.getTextContent().equals(name1)) {
                               System.out.println(bookProps.item(j).getNodeName() + ":" + bookProps.item(j).getTextContent());
                               System.out.println(bookProps.item(3).getNodeName() + ":" + bookProps.item(3).getTextContent());
                               System.out.println(bookProps.item(5).getNodeName() + ":" + bookProps.item(5).getTextContent());

                           }


                        }
                    }

                }
            }

           /* List<Element> books = nodeStream(nodeList).filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element1-> {
                        String author = element.getElementsByTagName("author").item(0).getTextContent();
                        String year = element.getElementsByTagName("year").item(0).getTextContent();
                        return author.equalsIgnoreCase("Лев Толстой") && year.equals("1869");
                    })
                    .collect(Collectors.toList());
            System.out.println(books);*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  /*  private static Stream<Node> nodeStream(NodeList nodeList) {
        List<Node> nodes = new ArrayList<>();

        for (int n = 0; n < nodeList.getLength(); ++n) {
            nodes.add(nodeList.item(n));
        }

        return nodes.stream();
    }*/
}
