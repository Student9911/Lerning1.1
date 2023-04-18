package LR10.task2.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class jsonAddRemoveAndSearchParse {

    public static void main(String[] args) {
        //Parsим json файл
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/task2/example2/Json_0x500605b01182c400_Event (1).json"));
            JSONObject jsonObject = (JSONObject) obj;
            Scanner in = new Scanner(System.in);
            int choose;
            System.out.println("Что вы хотите сделать?\n" +
                    "Для того чтобы добавить данные нажмите '1'\n" +
                    "для удаления нажмите '2'\n" +
                    "для поиска цифру 3, для просмотра всего файла нажать 4\n" +
                    "для выхода из программы любую другую кнопку");
            choose = in.nextInt();
            switch (choose) {
                case (4):
                    parseJsonData();
                    break;
                case (3):
                    searchDataJson();
                    break;
                case (2):
                    removeDataJson(jsonObject);
                    break;
                case (1):
                    dataAddJson(jsonObject);
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //Метод для добавления данных в файл
    private static void dataAddJson(JSONObject obj) {
        JSONArray jsonArray = (JSONArray) obj.get("events");
        JSONObject newBook = new JSONObject();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        newBook.put("name", in.nextLine());
        System.out.println("Введите номер");
        newBook.put("number", in.next());
        System.out.println("Введите цвет");
        newBook.put("color", in.next());
        System.out.println("Введите дату");
        newBook.put("date", in.next());
        jsonArray.add(newBook);

        try (FileWriter file = new FileWriter("src/LR10/task2/example2/Json_0x500605b01182c400_Event (1).json")) {
            file.write(obj.toJSONString());
            System.out.println("данные в Json файл успешно добавлены!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //Метод для удаления данных из файла
    private static void removeDataJson(JSONObject obj) {
        Scanner in = new Scanner(System.in);
        JSONArray jsonArray = (JSONArray) obj.get("events");
        System.out.println("Введите имя для удаления данных");
        String title = in.next();
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("name"))) {
                iterator.remove();
            }
        }
        try (FileWriter file = new FileWriter("src/LR10/task2/example2/Json_0x500605b01182c400_Event (1).json")) {
            file.write(obj.toJSONString());
            System.out.println("данные из Json файл успешно удалены!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //Метод для поиска данных в файле
    private static void searchDataJson() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя для поиска");
        String data = in.next();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/task2/example2/Json_0x500605b01182c400_Event (1).json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("events");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (data.equals(book.get("name"))) {
                    System.out.println("\nТекущий элемент: " + jsonObject.keySet().iterator().next());
                    System.out.println("Имя: " + book.get("name"));
                    System.out.println("Номер: " + book.get("number"));
                    System.out.println("Цвет: " + book.get("color"));
                    System.out.println("Дата: " + book.get("date").toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Метод парсер
    private static void parseJsonData () {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/task2/example2/Json_0x500605b01182c400_Event (1).json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("events");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: " + jsonObject.keySet().iterator().next());
                System.out.println("Код: " + book.get("name"));
                System.out.println("номер по порядку: " + book.get("number"));
                System.out.println("Время: " + book.get("color"));
                System.out.println("description: " + book.get("date"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}




