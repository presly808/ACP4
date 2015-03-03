package ua.artcode.week5.logs;

import org.apache.log4j.*;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

/**
 * Created by serhii on 15.02.15.
 */
public class TestExampleSimple {

    public static final String FILENAME = "/home/serhii/IdeaProjects/ACP4/temp/logs/my.log";

    public static void main(String[] args) throws IOException {
        Logger logger = LogManager.getLogger(TestExampleSimple.class);

        Layout layout = new XMLLayout();
        Appender appender = new FileAppender(layout, FILENAME);
        logger.addAppender(appender);
        logger.addAppender(new ConsoleAppender(layout));

        logger.info("First log info");


    }

}
