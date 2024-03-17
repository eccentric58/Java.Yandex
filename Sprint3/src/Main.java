import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static DinnerConstructor dc;

    public static void main(String[] args) {
        dc = new DinnerConstructor();

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    addNewDish();
                    break;
                case "2":
                    dc.printDishes();
                    break;
                case "3":
                    generateDishCombo();
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

    private static void addNewDish() {
        System.out.println("Введите тип блюда:");
        String dishType = scanner.nextLine();
        System.out.println("Введите название блюда:");
        String dishName;
        ArrayList<String> dishes;
        if (dc.dinner.containsKey(dishType)) {
            dishes = dc.dinner.get(dishType);
        } else {
            dishes = new ArrayList();
        }
        do {
            dishName = scanner.nextLine();
            if (!dishes.contains(dishName)) {
                dishes.add(dishName);
            } else {
                System.out.println("Блюдо уже есть!");
            }
        } while (!dishName.equals(""));

        dishes.remove(dishes.size() - 1);
        dc.dinner.put(dishType, dishes);
    }

    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = scanner.nextLine();
        ArrayList<String> comboDishes = new ArrayList<>();
        comboDishes.add(nextItem);

        while (!nextItem.isEmpty()) {
            nextItem = scanner.nextLine();
            comboDishes.add(nextItem);
        }

        comboDishes.remove(comboDishes.size() - 1);

        for (int i = 0; i < numberOfCombos; i++) {
            System.out.println("Комбо " + (i + 1));
            ArrayList<String> comboFinish = new ArrayList<>();
            for (String s : comboDishes) {
                if (dc.dinner.containsKey(s)) {
                    ArrayList<String> d = dc.dinner.get(s);
                    comboFinish.add(d.get(random.nextInt(d.size())));
                }
            }
            System.out.println(comboFinish);

        }
    }
}