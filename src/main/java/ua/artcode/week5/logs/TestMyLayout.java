package ua.artcode.week5.logs;

import org.apache.log4j.*;
import ua.artcode.week5.layouts.MySimpleLayout;

/**
 * Created by serhii on 15.02.15.
 */
public class TestMyLayout {


    public static void main(String[] args) {
        Logger parent = Logger.getLogger("ua.artcode");
        parent.setLevel(Level.INFO);
        parent.addAppender(new ConsoleAppender(new SimpleLayout()));
        parent.setAdditivity(true);

        //parent.info("test parent");

        Logger logger = Logger.getLogger("ua.artcode.test");
        logger.setLevel(Level.INFO);
        logger.addAppender(
                new ConsoleAppender(
                        new MySimpleLayout()));


        logger.info("Message");

    }

}
