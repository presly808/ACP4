package ua.artcode.week3.day1.refl;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by serhii on 31.01.15.
 */
public class IntroduceReflApi {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException {
        Person person = new Person(20, 49,
                "Jack", new double[]{1,2,3,4});

        Class cl = person.getClass(); // structure of person

        // cl = Person.class;

        System.out.println(cl.getName());

        Person created = (Person) cl.newInstance();

        Field fieldAge = cl.getDeclaredField("age"); // cl.getDeclaredField
        System.out.println(fieldAge.getType().getName() + " " + fieldAge.getName());

        Method methodSetNum = cl.getMethod("setNum",Integer.class);

        //Person person1 = (Person) cl.cast(person);

        //
        Field[] fields = cl.getDeclaredFields();

        System.out.println("*******************");
        showFieldInfo(person);

    }

    public static void showFieldInfo(Object obj) throws IllegalAccessException {
        Class cl = obj.getClass();
        for(Field field : cl.getDeclaredFields()){
            field.setAccessible(true);
            System.out.printf("type:%s,name:%s,value:%s\n", field.getType().getName()
                                                        , field.getName()
                                                        , field.get(obj));
        }
    }

    public static Object createAndSimpleInit(Class cl){
        try {
            Object o = cl.newInstance();
            for(Field field : cl.getDeclaredFields()){
                if(field.getType() == String.class){ //equals
                    field.setAccessible(true);
                    field.set(o, "TEST");
                } else if(field.getType() == int.class){
                    field.setInt(o, (int)(Math.random() * 10));
                }
            }

            return o;

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }


}

class Person {

    private int age;
    public Integer num;
    String name;
    double[] res;

    public Person() {
    }

    public Person(int age, Integer num, String name, double[] res) {
        this.age = age;
        this.num = num;
        this.name = name;
        this.res = res;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getRes() {
        return res;
    }

    public void setRes(double[] res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", res=" + Arrays.toString(res) +
                '}';
    }
}

