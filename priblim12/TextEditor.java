import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor {

    static Scanner scanner = new Scanner(System.in);
    static String fileName = "text.txt";

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 3) {

            System.out.println("1 - записати у файл");
            System.out.println("2 - прочитати файл");
            System.out.println("3 - вийти");
            System.out.print("виберіть дію: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                writeToFile();
            }
            else if (choice == 2) {
                readFile();
            }
            else if (choice == 3) {
                System.out.println("програма завершена");
            }
            else {
                System.out.println("невірний вибір");
            }
        }
    }

    public static void writeToFile() {

        try {
            FileWriter writer = new FileWriter(fileName, true);

            System.out.println("введіть текст:");
            String text = scanner.nextLine();

            writer.write(text + "\n");

            writer.close();

            System.out.println("текст записано");

        } catch (IOException e) {
            System.out.println("помилка запису у файл");
        }

    public static void readFile() {

        try {
            FileReader reader = new FileReader(fileName);

            int symbol;

            System.out.println("dміст файлу:");

            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Помилка читання файлу");
        }
    }
}

