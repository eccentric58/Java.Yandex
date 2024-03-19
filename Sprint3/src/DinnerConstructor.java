import java.util.*;

public class DinnerConstructor {
    Random random = new Random();
    Scanner scanner;
    HashMap<String, ArrayList<String>> dinner = new HashMap<>();

    public DinnerConstructor(Scanner scanner) {
        this.scanner = scanner;
    }

    void addNewDish() {
        System.out.println("Введите тип блюда:");
        String dishType = scanner.nextLine();
        System.out.println("Введите название блюда:");
        String dishName;
        ArrayList<String> dishes;
        if (dinner.containsKey(dishType)) {
            dishes = dinner.get(dishType);
        } else {
            dishes = new ArrayList<>();
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
        dinner.put(dishType, dishes);
    }

    void printDishes() {
        for (String s : dinner.keySet()) {
            ArrayList<String> list = dinner.get(s);
            System.out.print(s + ": ");
            System.out.println(list);
        }
        System.out.println();
    }

    // Перенес методы, но по ТЗ было написано оставить эти 2 метода в классе Main вроде как)
    void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = 0;

        while (true) {
            try {
                numberOfCombos = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести число. Попробуйте еще раз.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter)." +
                " Для завершения ввода введите пустую строку");

        String nextItem = scanner.nextLine();
        ArrayList<String> comboDishes = new ArrayList<>();
        comboDishes.add(nextItem);

        while (!nextItem.isEmpty()) {
            nextItem = scanner.nextLine();
            comboDishes.add(nextItem);
        }

        comboDishes.remove(comboDishes.size() - 1);
        // тут есть ошибка или "фича", если ввести после количество наборов пустую строчку, то метод вернет 3 пустых комбо))
        for (int i = 0; i < numberOfCombos; i++) {
            System.out.println("Комбо " + (i + 1));
            ArrayList<String> comboFinish = new ArrayList<>();
            for (String s : comboDishes) {
                if (dinner.containsKey(s)) {
                    ArrayList<String> d = dinner.get(s);
                    comboFinish.add(d.get(random.nextInt(d.size())));
                } else {
                    System.out.println("Данного меню нет в наличии. Выберете то, что есть.");
                    break;
                }
            }
            if (!comboFinish.isEmpty()) {
                System.out.println(comboFinish);
            }

        }
    }
}