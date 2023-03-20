package LR10.task2.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;

public class newCreateXmlFile {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docFactory.newDocumentBuilder();

            //создание корневого элемента
            Document doc = docBuild.newDocument();
            Element root = doc.createElement("library");
            doc.appendChild(root);

            // Добавление первого устройства
            Element device = doc.createElement("device");
            root.appendChild(device);

            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode("LTV"));
            device.appendChild(name);

            Element ip = doc.createElement("ipAdress");
            ip.appendChild(doc.createTextNode("192.168.1.2"));
            device.appendChild(ip);

            Element mac = doc.createElement("mac");
            mac.appendChild(doc.createTextNode("1A2s3c4B"));
            device.appendChild(mac);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer;
            transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,  "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new  javax.xml.transform.stream.StreamResult(new File("src/LR10/task2/example1/xmlTest.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }





    }
}
