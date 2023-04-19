package LR10.task2.example1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class xmlParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Если вы хотите добавить книгу введите 1 и нажмите enter\n" +
                "если удалить введите 2\n" +
                "посмотреть содержимое файла 3");
        switch (in.nextInt()) {
            case (1):
                bookAdd();
                break;
            case (2):
                bookSearchAndDel();
                break;
            case (3):
               bookSearchYearOrTitle();
                break;
            default:
                System.out.println("нет такой команды");

        }

    }

    public static void bookAdd() {
        try {
            File inputFile = new File("src/LR10/task2/example1/books.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            Element rootElement = document.getRootElement();
            Element book = new Element("book");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название книги");
            book.addContent(new Element("title").setText(in.nextLine()));
            System.out.println("Введите автора книги");
            book.addContent(new Element("author").setText(in.nextLine()));
            System.out.println("Введите год издания книги");
            book.addContent(new Element("year").setText(in.nextLine()));
            System.out.println("Введите цену книги");
            book.addContent(new Element("price").setText(in.nextLine()));
            rootElement.addContent(book);
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, new FileWriter("src/LR10/task2/example1/books.xml"));
            System.out.println("Новая книга добавлена в XML файл.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            throw new RuntimeException(e);
        }
    }

    public static void bookSearchAndDel() {
        System.out.println("Введите название книги для удаления");
        String bookTitleToDelete = new Scanner(System.in).nextLine();
        try {
            File inputFile = new File("src/LR10/task2/example1/books.xml");
            Document document = new SAXBuilder().build(inputFile);
            Element rootElement = document.getRootElement();
            List<Element> books = rootElement.getChildren("book");
            boolean search = true;
            for (Element book : books) {
                String title = book.getChildText("title");
                if (title.equals(bookTitleToDelete)) {
                    rootElement.removeContent(book);
                    XMLOutputter xmlOutput = new XMLOutputter();
                    xmlOutput.setFormat(Format.getPrettyFormat());
                    xmlOutput.output(document, new FileWriter("src/LR10/task2/example1/books.xml"));
                    System.out.println("Книга удалена из файла xml.");
                    search = false;
                    break;
                }
            }
            if (search) {
                System.out.println("В файле мы не нашли вашу книгу");
            }


        } catch (IOException | JDOMException e) {
            e.printStackTrace();
        }
    }

    public static void bookSearchYearOrTitle() {
        System.out.println("Введите год издания");
        String bookYearToDelete = new Scanner(System.in).nextLine();
        System.out.println("Введите название книги");
        String bookTitleToSearch = new Scanner(System.in).nextLine();
        try {
            File inputFile = new File("src/LR10/task2/example1/books.xml");
            Document document = new SAXBuilder().build(inputFile);
            Element rootElement = document.getRootElement();
            List<Element> books = rootElement.getChildren("book");
            boolean bookSearch = false;
            int counter = 1;
            for (Element book : books) {
                String year = book.getChildText("year");
                String title = book.getChildText("title");
                if (year.equals(bookYearToDelete) | title.equals(bookTitleToSearch)) {
                    System.out.println(counter + ". book");
                    System.out.println("["+ book.getChildText("title"));
                    System.out.println(book.getChildText("author"));
                    System.out.println(book.getChildText("year"));
                    System.out.println(book.getChildText("price") + "]\n\n");
                    bookSearch = true;
                    counter ++;

                }
            }
            if (!bookSearch) {
                System.out.println("Такой книги нет");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }

    }
}

