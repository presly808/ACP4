package ua.artcode.week8.day1.ioc.di;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by serhii on 14.03.15.
 */
public class DependencyInjector {

    public Map<String,Object> context;

    public DependencyInjector() {
        context = new HashMap<>(); // get from properties
        context.put("ua.artcode.week8.day1.ioc.di.IService", new IServiceB());
    }

    public void makeDependencies(Object obj){
        Class cl = obj.getClass();
        for(Field field : cl.getDeclaredFields()){
            field.setAccessible(true);
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
