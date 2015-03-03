package ua.artcode.week2;

/**
 * Created by serhii on 24.01.15.
 */
public class TestIO {

    public static final String PATH = "/home/serhii/IdeaProjects/ACP4/temp/simple.txt";
    public static final String OUT_PATH = "/home/serhii/IdeaProjects/ACP4/temp/out.txt";

    public static void main(String[] args) {
        String dest =
                IOUtils.readFrom(PATH);
        System.out.println(dest);

        IOUtils.writeTo(OUT_PATH,"Test OutputStream");


    }

}
