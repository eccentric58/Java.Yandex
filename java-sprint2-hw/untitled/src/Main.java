import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker(scanner, monthData);
        System.out.println(monthData.map);

        while (true) {
            printMenu();
            choiceCommand(scanner, stepTracker, monthData);
        }
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
                System.out.println("Сейчас цель по количеству шагов в день : " + stepTracker.goalByStepsPerDay);
                System.out.println("Введите новую цель по количеству шагов в день!");
                int goalByStepsPerDay = scanner.nextInt();
                stepTracker.changeStepGoal(goalByStepsPerDay);
                System.out.println("Цель по количеству шагов в день изменена на " + stepTracker.goalByStepsPerDay);
                System.out.println();
                break;
            case 3:
                System.out.println("За какой месяц вы хотите вывести информацию?");
                String month = scanner.next();
                monthData.printStats(month);
                System.out.println("Общее количество шагов за месяц " + month.toLowerCase() + ": " + stepTracker.getSumSteps());
                System.out.println("Максимальное количество шагов за месяц " + month.toLowerCase() + ": " + stepTracker.getMaxSteps());
                System.out.println("Лучшая серия шагов: " + stepTracker.getMaxSeries());
                break;
            case 4:
                System.out.println("Программа счетчик калорий завершена.");
                return;
            default:
                System.out.println("Вы ввели неверную команду.");
                System.out.println();
                break;
        }
    }
}
