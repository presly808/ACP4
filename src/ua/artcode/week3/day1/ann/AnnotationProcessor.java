package ua.artcode.week3.day1.ann;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */
public class AnnotationProcessor {


    public static void save(Object o, String path) {
        Class cl = o.getClass();

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println("class=" + cl.getName());//

            for (Field field : cl.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(FieldSave.class)) {
                    /*FieldSave fieldSave =
                            field.getAnnotation(FieldSave.class);
                    fieldSave.value();*/
                    pw.println(field.getName() + "=" + field.get(o));
                }
            }
            pw.flush();
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static Object read(String path){
        try {
            Scanner sc = new Scanner(new File(path));
            Map<String,String> map = new LinkedHashMap<>();

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] keyVal = line.split("=");
                map.put(keyVal[0], keyVal[1]);
            }

            Class cl = Class.forName(map.get("class"));
            Object inst = cl.newInstance();

            for(String fieldName : map.keySet()){
                Field field = cl.getDeclaredField(fieldName);
                field.setAccessible(true);
                // define type of value
                field.set(inst, map.get(fieldName));

            }

        } catch (FileNotFoundException | ClassNotFoundException
                | InstantiationException | NoSuchFieldException
                | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}