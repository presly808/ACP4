package ua.artcode.week2.day2;

/**
 * Created by serhii on 25.01.15.
 */
public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person(12, "Oleg", 20, 1000);
        Person p2 = new Person(2, "Oleg", 20, 1000);

        //Format
        System.out.printf("Contract between equals and hashCode = %s",
                p1.equals(p2) == (p1.hashCode() == p2.hashCode()));
    }

}
