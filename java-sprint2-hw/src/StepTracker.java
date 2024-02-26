import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    int goalByStepsPerDay = 10000;

    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }


    void AddNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if ((month < 0) && (month > 12)) {
            System.out.println("Номер месяца неправильный");
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 0 && day > 30) {
            System.out.println("Вы ввели неправильный день");
        }
        System.out.println("Введите количество шагов");
        int step = scanner.nextInt();
        if (step < 0) {
            System.out.println("Такого быть не может");
            return;
        }
        MonthData monthData = monthToData[month];
        monthData.days[day] = step;

    }

    void changeStepGoal() {
        System.out.println("Измените ");
        int step = scanner.nextInt();
        if (step > 0) {
            goalByStepsPerDay = step;
        } else {
            System.out.println("Вы ввели некорректное число");
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();
        if (month < 0 && month > 12) {
            System.out.println("Вы ввели неправильное число");
        }

        MonthData monthData = monthToData[month];
        int sumSteps = monthData.sumStepsFromMonth();
        for (int i = 0; i < monthData.days.length; i++) {
            if (monthData.days[i] != 0) {
                System.out.println(monthData.days[i]);
            }
        }
        System.out.println("Количество шагов за месяц " + month + ": " + sumSteps);
        System.out.println("Макимальное количество шагов за месяц " + monthData.maxSteps());
        System.out.println("Среднее пройденное количество шагов за месяц " + ((sumSteps) / 30));
        System.out.println("Общая пройденная дистанция за этот месяц " + converter.convertToKm(sumSteps));
        System.out.println("Вы сожгли килокалорий за месяц " + converter.convertStepsToKilocalies(sumSteps));
        System.out.println("Лучшая серия " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println();

    }
}