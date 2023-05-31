package LR8.example1;

import java.io.*;
import java.net.URL;

public class InConvertInText {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);

            } else {
                System.out.println("\n" + "конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("F:\\MyFile3.txt");

            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();


            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl=new InputStreamReader(inUrl, "cp1251"); // символьный
// поток
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close(); // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11});
            Reader rArray=new InputStreamReader(inArray,"cp1251" ); // символьный
// поток
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка" + e);
        }
    }
}
