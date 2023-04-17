package LR8.example2;
import java.io.*;

public class example2 {
    public static void main(String[] args) {
        try {
            // Открываем исходный файл для чтения
            FileInputStream fis = new FileInputStream("src/LR8/example2/input.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            // Считываем данные из исходного файла
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line1_2 = line1 + " " + line2;
            String[] numbers = line1_2.split(" ");
            double[] doubles = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                doubles[i] = Double.parseDouble(numbers[i]);
            }

            // Закрываем исходный файл
            br.close();
            isr.close();
            fis.close();

            // Открываем результирующий файл для записи
            FileOutputStream fos = new FileOutputStream("src/LR8/example2/output.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            // Переписываем вторую строку и положительные числа в результирующий файл
            bw.write("Вторая строка");
            bw.newLine();
            bw.write(line2);
            bw.newLine();
            bw.write("Все положительные числа");
            bw.newLine();

            for (double d : doubles) {
                if (d > 0) {
                    bw.write(Double.toString(d));
                    bw.newLine();
                }
            }

            // Закрываем результирующий файл
            bw.close();
            osw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
