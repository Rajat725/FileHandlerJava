package tests;


import org.json.JSONArray;
import org.json.JSONObject;

public class File8Op {
    public static void main(String[] args) {

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name", "jon doe");
        jsonObject.put("age", "22");
        jsonObject.put("city", "chicago");
        System.out.println(jsonObject);
        JSONArray jsonArray=new JSONArray();
        jsonArray.put("Lol");
        jsonArray.put("Max");
        jsonArray.put("Min");
        System.out.println(jsonArray);
        System.out.println(jsonArray.put(jsonObject));
        JSONArray jsonArray1=new JSONArray();
        jsonArray1.put("Max,Min,TO");
        JSONObject jsonObject1=new JSONObject();
        jsonObject1.put("Name","Rajat");
        jsonObject1.put("Area","Rohtak");
        jsonObject1.put("Speciality",jsonArray1);
        System.out.println(jsonObject1);


    }
}
