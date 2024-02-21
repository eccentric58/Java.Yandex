import java.util.InputMismatchException;
import java.util.Scanner;

// Проект выложен на открытый github: https://github.com/eccentric58/Java.Yandex
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует список покупок!");
        ListShopping listShopping = new ListShopping();

        while (true) {
            try {
                System.out.println("Введите команду от 1 до 4.");
                listShopping.printMenu();
                int command = scanner.nextInt();
                listShopping.commandSelection(command);
                if (command == 4) break;
            } catch (InputMismatchException o) {
                System.out.println("Вы ввели не цифру.");
                scanner.nextLine();
            }
        }
    }
}