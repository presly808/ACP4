package ua.artcode.week1;

/**
 * Created by serhii on 17.01.15.
 */
public class TestStatic {

    public static void main(String[] args) {
        A a = new A();
        a.doNonStatic();
        A.doStatic();
    }



}


class A {

    static int count = 0;

    String desc = "desc";

    public static void doStatic(){
        System.out.println(count);
    }

    public void doNonStatic(){
        count++;
    }



}
