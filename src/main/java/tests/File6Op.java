package tests;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File6Op {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader=new FileReader(".\\Data\\dataJson.json");
        Gson gson=new Gson();
        Person person = gson.fromJson(fileReader, Person.class);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAddress().get(0).getHouseName());
        System.out.println(person.getAddress().get(0).getStreet());


    }

}
