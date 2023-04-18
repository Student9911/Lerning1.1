package LR10.task2.example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Parse {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/task2/example3/JsonNewsData.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("events");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: " + jsonObject.keySet().iterator().next());
                System.out.println("Новость: " + book.get("subject"));
                System.out.println("Дата новости: " + book.get("date"));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





