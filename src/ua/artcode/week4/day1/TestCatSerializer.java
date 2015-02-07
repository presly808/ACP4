package ua.artcode.week4.day1;

/**
 * Created by serhii on 07.02.15.
 */
public class TestCatSerializer {

    private static final String CAT_PATH = "../ACP4/temp/cat.data";

    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat("murchik");
        //SerialUtils.save(cat, "");
        Cat catFrom = (Cat) SerialUtils.load(CAT_PATH);
        System.out.println(catFrom);
    }

}
