package ua.artcode.week4.day1;

import java.io.Serializable;

/**
 * Created by serhii on 07.02.15.
 */
public class Cat implements Serializable {

    private static final long serialVersionUID = -5120330070259627064L;

    private int age;

    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
