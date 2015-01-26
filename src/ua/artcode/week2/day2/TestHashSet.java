package ua.artcode.week2.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by serhii on 25.01.15.
 */
public class TestHashSet {


    public static void main(String[] args) {
        Person p1 = new Person(1, "Kolia", 20, 1000);
        Person p2 = new Person(2, "Valeriy", 24, 1000);
        Person p3 = new Person(3, "Anatoliy", 26, 1000);
        Person p4 = new Person(4, "Olexiy", 22, 1000);
        Person p5 = new Person(5, "Vova", 23, 1000);
        Person p6 = new Person(6, "Kolia", 20, 1000);
        Person p7 = new Person(6, "Kolia", 20, 1000);


        Set<Person> set = new LinkedHashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);

        Iterator<Person> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


        System.out.println(set.size());
    }
}
