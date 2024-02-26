import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MonthData {

    static ArrayList<String> month = new ArrayList<>();
    static Map<String, HashMap<Integer, Integer>> map = new HashMap<>();
    static StepTracker stepTracker;

    MonthData() {
        fillMonth();
        for (int i = 0; i < month.size(); i++) {
        }
    }

    void printStats(String month) {
        if (MonthData.map.containsKey(month)) {
            System.out.println("Месяц " + month.toLowerCase() + ":");
            for (Integer i : stepTracker.steps.keySet()) {
                System.out.println("День " + i + " шагов: " + stepTracker.steps.get(i));
            }
        }
    }

    void fillMonth() {
        month.add("Январь");
        month.add("Февраль");
        month.add("Март");
        month.add("Апрель");
        month.add("Май");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        month.add("Сентябрь");
        month.add("Октябрь");
        month.add("Ноябрь");
        month.add("Декабрь");
    }

}
