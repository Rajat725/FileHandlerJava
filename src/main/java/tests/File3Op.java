package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class File3Op {
    public static void main(String[] args) throws IOException {
        //Writing Data into property file
        Properties properties=new Properties();
        properties.setProperty("Name","Rajat");
        properties.setProperty("Age","23");
        properties.setProperty("Email","ImRajat108@gmail.com");
        String path=System.getProperty("user.dir")+"//Data//config.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        fileOutputStream.close();
        //Reading data from file
        FileInputStream fileInputStream=new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("Name"));
        System.out.println(properties.getProperty("Age"));
        System.out.println(properties.getProperty("Email"));
         Set<Object> keys = properties.keySet();
        for (Object object:keys) {
            System.out.println(object.toString()+" "+properties.getProperty(object.toString()));
        }
        properties.keySet().forEach(key-> System.out.println(key.toString()+" "+properties.getProperty(key.toString())));
        fileInputStream.close();

    }
}
