package LR8.example3;
import java.io.*;

public class example3 {
    public static void main(String[] args) {
        try {
            // Открываем исходный файл для чтения
            FileInputStream fis = new FileInputStream("src/LR8/example3/input.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            // Открываем результирующий файл для записи
            FileOutputStream fos = new FileOutputStream("src/LR8/example3/output.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            // Считываем данные из исходного файла и переписываем слова начинающиеся с согласных букв в результирующий файл
            String line;
            int lineNumber = 0;
            String letters = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");
                int count = 0;
                for (String word : words) {
                    if (letters.contains(word.substring(0,1))) {
                        bw.write(lineNumber + ": " + word);
                        count++;
                    }
                }
                bw.newLine();
                bw.write("Из строки № " + lineNumber + ": " + "Выбранных слов " + count);
                bw.newLine();
            }

            // Закрываем файлы
            br.close();
            isr.close();
            fis.close();
            bw.close();
            osw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}