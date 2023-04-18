package LR10.task2.example4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EmptyFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelParser {
    public static void main(String[] args) {
        try {
            // Открываем файл Excel
            FileInputStream inputStream = new FileInputStream(new File("src/LR10/task2/example4/book1.xlsx"));
            Workbook workbook = WorkbookFactory.create(inputStream);

            // Получаем лист Excel по индексу
            Sheet sheet = workbook.getSheetAt(0);

            // Итерируемся по строкам и ячейкам листа Excel
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Выводим значение ячейки
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Закрываем файл Excel
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            // Обработка ошибок
            System.out.println("Не получается открыть таблицу, проверьте файл");

        } catch (EmptyFileException e) {
            System.out.println("Этот файл пуст, проверьте путь до файла или сначала заполните его данными");
        }
    }
}
