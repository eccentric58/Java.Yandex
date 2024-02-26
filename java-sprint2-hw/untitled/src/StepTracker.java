import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {

    int goalByStepsPerDay = 10000;
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

    void changeStepGoal(int newChangeStepGoal) {
        goalByStepsPerDay = newChangeStepGoal;
    }

    int getSumSteps() {
        int sum = 0;
        for (int value : steps.values()) {
            sum += value;
        }
        return sum;
    }

    int getMaxSteps() {
        int max = 0;
        for (int value : steps.values()) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    int getMaxSeries() {
        int localMax = 0;
        int globalMax = 0;
        for (int value : steps.values()) {
            if (value > goalByStepsPerDay) {
                localMax++;
            } else {
                globalMax = localMax;
                localMax = 0;
            }
        }
        return globalMax;
    }
}
