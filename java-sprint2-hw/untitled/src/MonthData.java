import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // вывод элементов массива в нужном формате
            System.out.println("День " + i + ": " + days[i] + " шагов.");
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;

        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum;
    }


    int maxSteps() {
        int max = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > max) {
                max = days[i];
            }
        }
        return max;
    }

    int bestSeries(int goalByStepsPerDay) {
        int localBestSeries = 0;
        int globalBestSeies = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > goalByStepsPerDay) {
                localBestSeries++;
            } else {
                globalBestSeies = localBestSeries;
                localBestSeries = 0;
            }
        }
        return globalBestSeies;
    }
}
