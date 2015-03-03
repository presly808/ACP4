package ua.artcode.week2;

import java.io.*;

/**
 *
 */
public class IOUtils {


    public static String readFrom(String path){
        String dest = "";
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            int c = 0;
            while((c = is.read()) != -1){
                dest += (char)c;
            }
            return dest;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {

            if(is != null){
               try {
                   is.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
            }

        }
        return "";
    }

    public static void writeTo(String path, String src){
        //try with resources from 1.7
        try(OutputStream os = new FileOutputStream(path)){
            byte[] arr = src.getBytes();
            os.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serial() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                                        new BufferedOutputStream(
                                            new FileOutputStream("/home/some.txt")));
        oos.write(78);
    }

    public static void reader(InputStream is){

        //ADAPTER
        InputStreamReader streamReader = new InputStreamReader(is);

        //DECORATOR
        BufferedReader br = new BufferedReader(streamReader);


    }

}
