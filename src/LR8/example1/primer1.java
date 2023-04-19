package LR8.example1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class primer1 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {

        while (true) {
            int oneByte = in.read();    // читает 1 байт
            if (oneByte != -1) {        //признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.println("\nend");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        try {
            //С потоком связан файл страница
            InputStream inFile = new FileInputStream("f:/MyFile2.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            //С потоком связана интернет страница
            InputStream inUrl = new URL("https://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            //С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {72, 101, 108, 108, 111});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
