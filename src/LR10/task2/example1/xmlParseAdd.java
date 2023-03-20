package LR10.task2.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class xmlParseAdd {
    private static String names;
    private static String ipAdr;
    private static String macAdr;

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя устройства");
            names = in.nextLine();
            System.out.println("Введите IP-Adress");
            ipAdr = in.nextLine();
            System.out.println("Введите Mac-adress");
            macAdr = in.nextLine();

            File inputFile = new File("src/LR10/task2/example1/xmlTest.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);

            Element newElement = doc.getDocumentElement();


            Element newDevice = doc.createElement("device");

            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(String.valueOf(names)));
            newDevice.appendChild(name);

            Element ip = doc.createElement("ipAdress");
            ip.appendChild(doc.createTextNode(String.valueOf(ipAdr)));
            newDevice.appendChild(ip);

            Element mac = doc.createElement("mac");
            mac.appendChild(doc.createTextNode(String.valueOf(macAdr)));
            newDevice.appendChild(mac);

            newElement.appendChild(newDevice);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,  "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");


            StreamResult result = new StreamResult(new File("src/LR10/task2/example1/xmlTest.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            System.out.println("DONE");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
