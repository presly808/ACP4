package ua.artcode.week5;

import org.w3c.dom.*;

/**
 * Created by serhii on 14.02.15.
 */
public class DomParserUtils {


    public static void showXML(Element element) {

        System.out.printf("<%s%s>",
                element.getTagName(),
                element.hasAttributes() ? formatAttr(element) : "");

        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node child = nodeList.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                showXML((Element) child);
            } else if (child.getNodeType() == Node.TEXT_NODE) {
                System.out.print(child.getNodeValue());
            }
        }

        System.out.printf("</%s>", element.getTagName());


    }

    private static String formatAttr(Element element){
        String result = " ";
        NamedNodeMap namedNodeMap = element.getAttributes();
        for (int i = 0; i < namedNodeMap.getLength(); i++) {
            Node node = namedNodeMap.item(i);
            Attr attr = (Attr) node;
            result += attr.getName() + "=\"" + attr.getValue() + "\" ";
        }
        return result;

    }

}
