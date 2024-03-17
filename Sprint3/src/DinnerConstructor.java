import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class DinnerConstructor {

    HashMap<String, ArrayList<String>> dinner = new HashMap<>();

    void printDishes() {
        for (String s : dinner.keySet()) {
            ArrayList<String> list = dinner.get(s);
            System.out.print(s + ": ");
            System.out.println(list);
        }
        System.out.println();
    }
}