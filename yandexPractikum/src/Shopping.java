import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    public static void printMenu() {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listShopping = new ArrayList<>();

        System.out.println("Вас приветствует список покупок!");

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите товар, который хотите добавить:");
                String productName = scanner.next();
                listShopping.add(productName);
            } else if (command == 2) {
                System.out.println("Список товаров: ");
                int count = 1;
                for (String i : listShopping) {
                    System.out.print(count + ". " + i);
                    System.out.println();
                    count++;
                }
            } else if (command == 3) {
                listShopping.clear();
                System.out.println("Список товаров очистен.");
            } else if (command == 4) {
                System.out.println("Работа приложения списка покупок завершена.");
                break;
            }
            System.out.println();
        }
    }
}