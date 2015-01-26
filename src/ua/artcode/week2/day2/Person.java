package ua.artcode.week2.day2;

/**
 * Created by serhii on 25.01.15.
 */
public class Person {


    private long id;
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(long id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //Effective Java -  equals and hashCode
    @Override
    public boolean equals(Object o){
        if(o == null) return false;

        if(this == o) return true;

        if(Person.class != o.getClass()) return false;

        Person other = (Person) o;

        return this.id == other.id
                && this.age == other.age
                && (name != null && name.equals(other.name))
                && Double.compare(this.salary, other.salary) == 0;
    }

    @Override
    public int hashCode(){
        int hash = 1;
        hash = 31 * hash + age;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + (int)(id ^ (id >>> 32));
        long temp = Double.doubleToLongBits(salary);
        hash = 31 * hash + (int)(temp ^ (temp >>> 32));

        return hash;
    }



}
