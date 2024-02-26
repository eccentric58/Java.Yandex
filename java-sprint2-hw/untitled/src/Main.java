import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker(scanner, monthData);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            choiceCommand(scanner, command, stepTracker, monthData);
        }
    }

    public static void printMenu() {
        System.out.println("1. Ввод количества шагов за определенный день.");
        System.out.println("2. Изменить цель по количеству шагов в день.");
        System.out.println("3. Напечатать статистику за определенный месяц.");
        System.out.println("4. Выход из приложения.");
    }

    public static void choiceCommand(Scanner scanner, int command, StepTracker stepTracker, MonthData monthData) {
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
        }
    }
}
