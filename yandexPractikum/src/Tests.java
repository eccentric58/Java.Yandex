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

    @Test
    public void test4() {
        ListShopping list = new ListShopping();
        list.addingProduct("Буханка хлеба");
        List<String> listCopy = new ArrayList<>(list.listShopping);

        Assert.assertEquals("буханка", listCopy.get(0));
        // Этот тест не проходит, потому при добавлении Буханки хлеба "хлеба" куда-то пропадает, но
        // по ТЗ мы вводим данные именно через нижнее подчеркивание. Если поясните как этот момент исправить,
        // то буду Вам благодарен))
    }
}
