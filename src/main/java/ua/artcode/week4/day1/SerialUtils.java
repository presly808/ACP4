package ua.artcode.week4.day1;

import java.io.*;

/**
 * Created by serhii on 07.02.15.
 */
public class SerialUtils {


    public static void save(Object obj, String path) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(path))){
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object load(String path) throws ClassNotFoundException {
        try (ObjectInputStream oos =
                     new ObjectInputStream(
                             new FileInputStream(path))){
            return oos.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
        return null;
    }


}
