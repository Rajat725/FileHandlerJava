package tests;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File5Op {
    public static void main(String[] args) throws IOException {
        File file=new File(".\\Data\\dataJson.json");
        ObjectMapper objectMapper=new ObjectMapper();
        Person person = objectMapper.readValue(file, Person.class);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAddress().get(0).getHouseName());
        System.out.println(person.getAddress().get(0).getStreet());



    }
}
