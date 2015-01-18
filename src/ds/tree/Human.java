package ds.tree;

/**
 * Created by serhii on 18.01.15.
 */
public class Human implements Comparable<Human> {

    private int age;
    private String name;
    private double salary;

    public Human() {
    }

    public Human(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Human o) {

        return this.age > o.age ?
                1 : this.age < o.age ?
                                    -1 : 0;
    }
}
