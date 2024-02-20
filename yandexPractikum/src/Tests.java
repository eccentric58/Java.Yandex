import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void test1() {
        ListShopping shopping = new ListShopping();
        shopping.addingProduct("Вареники");
        shopping.addingProduct("Пельмени");
        shopping.addingProduct("Картошка");
        List<String> shoppingCopy = new ArrayList<>();
        shoppingCopy.addAll(shopping.listShopping);
        List<String> list = new ArrayList<>();
        list.add("вареники");
        list.add("пельмени");
        list.add("картошка");
        Assert.assertEquals(list, shoppingCopy);
    }
    @Test
    public void test2() {
        ListShopping shopping = new ListShopping();
        shopping.addingProduct("Пельмени");
        List<String> shoppingCopy = new ArrayList<>();
        shoppingCopy.addAll(shopping.listShopping);
        List<String> list = new ArrayList<>();
        list.add("пельмени");
        Assert.assertEquals(list, shoppingCopy);
    }
    @Test
    public void test3() {
        ListShopping shopping = new ListShopping();
        shopping.addingProduct("КАРТОШКА");
        shopping.addingProduct("ПЕльмеНи");
        shopping.addingProduct("ТыкВА");
        shopping.addingProduct("кошка");
        shopping.addingProduct("МАКАроны");
        List<String> shoppingCopy = new ArrayList<>(shopping.listShopping);
        List<String> shoppintTest = new ArrayList<>();
        shoppintTest.add("картошка");
        shoppintTest.add("пельмени");
        shoppintTest.add("тыква");
        shoppintTest.add("кошка");
        shoppintTest.add("макароны");
        Assert.assertEquals(shoppintTest, shoppingCopy);
    }

//    public void test4() {
//        int command = 4;
//        ListShopping list = new ListShopping();
//        Assert.assertEquals("Программа списка товаров завершена.", );
//    }
}
