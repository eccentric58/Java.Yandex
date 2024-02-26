import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    MonthData monthData;
    static HashMap<Integer, Integer> steps = new HashMap<>();
    Scanner scanner;

    StepTracker(Scanner scanner, MonthData monthData) {
        this.scanner = scanner;
        this.monthData = monthData;
    }

    void fillDayAndStep(int day, int step) {
        steps.put(day, step);
    }

    void addNewNumberStepsPerDay() {
        System.out.println("За какой месяц Вы хотите добавить информацию?");
        String month = scanner.next();
        System.out.println("За какой день вы хотите добавить информацию?");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int step = scanner.nextInt();
        fillDayAndStep(day, step);
        MonthData.map.put(month, steps);
    }
}
