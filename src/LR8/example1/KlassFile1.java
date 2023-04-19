package LR8.example1;

import java.io.File;

public class KlassFile1{
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке (где расположен файл KlassFile1.java)
            File file1 = new File("MyFile1.txt");
            file1.createNewFile();
            if (file1.exists()) {
                System.out.println("Файл создан");
                System.out.println("Полный путь1: " + file1.getAbsolutePath());
            }
            // Создание файла на диске C и вывод полного пути
            File file2 = new File("F:\\MyFile2.txt");
            file2.createNewFile();
            System.out.println("Полный путь до файла2: " +file2.getAbsolutePath());

            // Создание нескольких вложенных папок
            File file3 = new File("F:\\folder1\\folder2\\folder3\\");
            file3.mkdirs();
            File file4 = new File("F:\\folder1\\folder2\\folder3\\MyFile3.txt");
            file4.createNewFile();
            System.out.println("Полный путь файла3: " +file4.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка");
            e.printStackTrace();

        }
    }
}
