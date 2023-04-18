package LR10.task2.example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class creatorJson {
    public static void main(String[] args) {

        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("subject", "ЛЕТНЯЯ СЕССИЯ ЗАОЧНИКОВ ПЕРВОГО КУРСА");
        book1.put("date", "16.05.22");





        books.add(book1);
        library.put("events", books);


        try (FileWriter file = new FileWriter("src/LR10/task2/example3/JsonNewsData.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


