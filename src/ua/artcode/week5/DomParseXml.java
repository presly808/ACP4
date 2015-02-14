package ua.artcode.week5;

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

/**
 * Created by serhii on 14.02.15.
 */
public class DomParseXml {


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory builderFactory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder =
                builderFactory.newDocumentBuilder();
        /*/home/serhii/IdeaProjects/ACP4/temp/week5/users.xml*/
        Document document = documentBuilder.parse(new File("../ACP4/temp/week5/users.xml"));

        Element root = document.getDocumentElement(); // get root
        DomParserUtils.showXML(root);

    }

}
