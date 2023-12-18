package tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class File7Op {
    public static void main(String[] args) throws IOException, ParseException {
        FileReader fileReader=new FileReader(".\\Data\\dataJson.json");

        JSONParser jsonParser=new JSONParser();
         Object parse = jsonParser.parse(fileReader);
         JSONObject person = (JSONObject) parse;
        System.out.println(person.get("firstName").toString());
        System.out.println(person.get("lastName").toString());
         JSONArray person1 = (JSONArray) person.get("address");
        for (int i = 0; i < person1.size(); i++) {
             Object object = person1.get(i);
             JSONObject object1 = (JSONObject) object;
            System.out.println(object1.get("code").toString());
        }


    }
}
