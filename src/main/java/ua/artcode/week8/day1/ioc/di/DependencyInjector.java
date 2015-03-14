package ua.artcode.week8.day1.ioc.di;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by serhii on 14.03.15.
 */
public class DependencyInjector {

    public Map<String,Object> context;

    public DependencyInjector() {
        init();
    }

    private void init(){
        context = new HashMap<>();

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("/home/serhii/IdeaProjects/ACP4/src/main/resources/week8/di.properties"));
            Set<String> keys = properties.stringPropertyNames();
            for(String key : keys){
                String value = properties.getProperty(key);
                Class cl = Class.forName(value);
                Object instance = cl.newInstance(); // create singleton by name
                context.put(key, instance);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeDependencies(Object obj){
        Class cl = obj.getClass();
        for(Field field : cl.getDeclaredFields()){
            field.setAccessible(true);

            if(field.isAnnotationPresent(ForInject.class)){
                String fieldTypeName = field.getType().getName();
                Object contextBean = context.get(fieldTypeName);//get bean
                try {
                    field.set(obj,contextBean); // do injection
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }


        }


    }



}
