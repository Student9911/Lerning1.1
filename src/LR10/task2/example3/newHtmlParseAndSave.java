package LR10.task2.example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class newHtmlParseAndSave {
    private static boolean write;
    private static String subject;
    private static String dateStr;


    public static void main(String[] args) {

        try {
            // Получаем HTML код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Извлекаем список новостей
            Elements newParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");
            // Проходим циклом по последним 9 новостям и записываем значения строк
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newParent.get(0).childNodes();
                    subject = String.valueOf(((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0));
                    dateStr = String.valueOf(((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0));
                    //запускаем по каждой новости метод для хранения новостей и передаем в него наши строки
                    //для сравнения и записи
                    dataAddJson(subject, dateStr);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Метод который добавляет в файл json новости, если их не нашел в предидущих записях
    private static void dataAddJson(String subject, String date) {
        try {
            System.out.println("Запустился метод");
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/task2/example3/JsonNewsData.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("events");
            //обходим циклом массив jsona и сравниваем значения
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (date.equals(book.get("date")) & subject.equals(book.get("subject"))) {
                    System.out.println("\nТекущий элемент: " + jsonObject.keySet().iterator().next());
                    System.out.println("subject: " + book.get("subject"));
                    System.out.println("date: " + book.get("date"));
                    write = false;
                    // если нашли значения выходим из метода
                    break;
                    //иначе устанавливаем значение true
                } else {
                    write = true;
                }
            }
            //Если значение True значит мы не нашли в записях новость и надо ее записать
            if (write) {
                System.out.println("создаем новую запись");
                JSONObject newEvents = new JSONObject();
                newEvents.put("subject", subject);
                newEvents.put("date", date);
                jsonArray.add(newEvents);
                System.out.println("и пишем в файл");

                try (FileWriter file = new FileWriter("src/LR10/task2/example3/JsonNewsData.json")) {
                    file.write(jsonObject.toJSONString());
                    System.out.println("данные в Json файл успешно добавлены!");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}









