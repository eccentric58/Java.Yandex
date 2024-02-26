import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker(scanner, monthData);
        System.out.println(monthData.map);

//        while (true) {
//            printMenu();
//            choiceCommand(scanner, stepTracker, monthData);
//        }
    }

    private static void printMenu() {
        System.out.println("Введите команду:");
        System.out.println("1. Ввод количества шагов за определенный день.");
        System.out.println("2. Изменить цель по количеству шагов в день.");
        System.out.println("3. Напечатать статистику за определенный месяц.");
        System.out.println("4. Выход из приложения.");
    }

    private static void choiceCommand(Scanner scanner, StepTracker stepTracker, MonthData monthData) {

        int command = scanner.nextInt();
        switch (command) {

            case 1:
                stepTracker.addNewNumberStepsPerDay();
                break;
            case 2:
                break;
            case 3:
                System.out.println("За какой месяц вы хотите вывести информацию?");
                String month = scanner.next();
                monthData.printStats(month);
                break;
            case 4:
                System.out.println("Программа счетчик калорий завершена.");
                return;
            default:
                System.out.println("Вы ввели неверную команду.");
                break;
        }
    }
}
