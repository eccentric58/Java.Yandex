import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вас приветствует список покупок!");

        ListShopping list = new ListShopping();

        while (true) {
            System.out.println("Введите команду от 1 до 4.");
            list.printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите товар, который хотите добавить: ");
                    String product = scanner.next();
                    list.addingProduct(product);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Список товаров: ");
                    list.printProduct();
                    System.out.println();
                    break;
                case 3:
                    list.deleteProducts();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Программа списка товаров завершена.");
                    break;
            }
        }
    }
}