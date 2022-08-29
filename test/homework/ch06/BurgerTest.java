package homework.ch06;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {

    @Test
    void menuName() {
        Burger burger = new Burger();
        String menuName = burger.menuName(2);

        assertEquals("coke", menuName);
    }

    @Test
    void menuSum() throws NoSuchFieldException {
        Burger burger = new Burger();
//        Field field = burger.getClass().getDeclaredField("basicPrice"); //private variable에 접근하는 방법
//        field.setAccessible(true); //private field를 변수에 담았으니 접근 가능하게 만든다.
//
//        burger.menuId = 1;
        int a = burger.getBasicPrice();
        double price = burger.menuSum(1000);

        assertEquals(3700, price);
    }

    @Test
    void tot(){
        Burger burger = new Burger();
        int a = burger.sum(10,10);
        System.out.println(a);
    }
}