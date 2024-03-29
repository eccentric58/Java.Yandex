import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static StepTracker stepTracker = new StepTracker(scanner);
    static boolean theEnd = true;

    public static void main(String[] args) {

        while (theEnd) {
            printMenu();
            choiceCommand(scanner);
        }
    }

    private static void printMenu() {
        System.out.println("Введите команду:");
        System.out.println("1. Ввод количества шагов за определенный день.");
        System.out.println("2. Изменить цель по количеству шагов в день.");
        System.out.println("3. Напечатать статистику за определенный месяц.");
        System.out.println("4. Выход из приложения.");
    }

    private static void choiceCommand(Scanner scanner) {
        int command = scanner.nextInt();
        switch (command) {

            case 1:
                stepTracker.AddNewNumberStepsPerDay();
                break;
            case 2:
                stepTracker.changeStepGoal();
                break;
            case 3:
                stepTracker.printStatistic();
                break;
            case 4:
                System.out.println("Программа завершена.");
                theEnd = false;
                return;
            default:
                System.out.println("Вы ввели неверную команду.");
                break;
        }
    }
}