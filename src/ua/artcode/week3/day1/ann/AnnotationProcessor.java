package ua.artcode.week3.day1.ann;

import java.lang.reflect.Field;

/**
 *
 */
public class AnnotationProcessor {


    public static void save(Object o, String path){
        Class cl = o.getClass();

        for(Field field : cl.getDeclaredFields()){
            field.setAccessible(true);
            if(field.isAnnotationPresent(FieldSave.class)){
                FieldSave fieldSave =
                        field.getAnnotation(FieldSave.class);
                fieldSave.value();
                //save logic
            }

        }

    }

}
