package xml_file;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXml {

    public  static void main(String[] args) {

        File file = new File("C:\\Users\\musta\\IdeaProjects\\JavaExam\\src\\xml_file\\userandpass.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();


        try {


            DocumentBuilder dB = dbf.newDocumentBuilder();

            Document doc = dB.parse(file);



            NodeList nl = doc.getElementsByTagName("idpass");

            for (int a = 0; a < nl.getLength(); a++){

                Node nN = nl.item(a);

                Element ele = (Element) nN;

                System.out.println(ele.getElementsByTagName("user").item(0).getTextContent());
                System.out.println(ele.getElementsByTagName("pass").item(0).getTextContent());
                System.out.println("*********");

            }


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

    }}

