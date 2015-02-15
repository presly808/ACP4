package ua.artcode.week5;

import org.w3c.dom.*;

/**
 * Created by serhii on 14.02.15.
 */
public class DomParserUtils {


    public static String getString(Element element) {

        String res = String.format("<%s%s>",
                element.getTagName(),
                element.hasAttributes() ? formatAttr(element) : "");

        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node child = nodeList.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                res += getString((Element) child);
            } else if (child.getNodeType() == Node.TEXT_NODE) {
                res += child.getNodeValue();
            }
        }

        res += String.format("</%s>", element.getTagName());

        return res;


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
