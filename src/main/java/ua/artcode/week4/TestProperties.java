package ua.artcode.week4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 */
public class TestProperties {

    public static final String PATH = "../ACP4/temp/game.properties";

    public static void main(String[] args) throws IOException {
        //intiProperties(PATH);

        printProperties(PATH);

    }

    public static void printProperties(String path) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        Set<String> keys = properties.stringPropertyNames();

        for(String key : keys){
            System.out.printf("%s=%s\n", key, properties.getProperty(key));
        }
    }

    public static void intiProperties(String path) throws IOException {
        Properties ps = new Properties();
        ps.setProperty("user.name", "demonkiller2000");
        ps.setProperty("user.size", "20");
        ps.setProperty("video.quality", "10");
        ps.store(new FileOutputStream(path), "GAME PROPERTIES");
    }


}
