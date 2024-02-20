import java.util.ArrayList;
import java.util.List;

public class ListShopping {
    protected List<String> listShopping = new ArrayList<>();
    protected void addingProduct(String product) {
        if (listShopping.contains(product.toLowerCase())) {
            System.out.println("Данный товар уже есть в списке покупков.");
        } else {
            listShopping.add(product.toLowerCase());
        }
    }
    protected void deleteProducts() {
        if (listShopping.isEmpty()) {
            System.out.println("Список товаров пуст.");
        } else {
            listShopping.clear();
            System.out.println("Список товаров пуст.");
        }
    }

    protected void printProduct() {
        if (listShopping.isEmpty()) {
            System.out.println("Список товаров пуст.");
        } else {
            int count = 1;
            for (String i : listShopping) {
                System.out.println(count + ": " + i.substring(0, 1).toUpperCase() + i.substring(1) + ".");
                count++;
            }
        }
    }
    protected static void printMenu() {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");
    }
}
