import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static DinnerConstructor dc;

    public static void main(String[] args) {
        dc = new DinnerConstructor(scanner);

        while (true) {
            printMenu();
            String command = scanner.nextLine().trim();

            switch (command) {
                case "1":
                    dc.addNewDish();
                    break;
                case "2":
                    dc.printDishes();
                    break;
                case "3":
                    dc.generateDishCombo();
                    break;
                case "4":
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Вывести список блюд");
        System.out.println("3 - Сгенерировать комбинации блюд");
        System.out.println("4 - Выход");
    }
}