package homework.ch06;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalcImplTest {
    private CalcImpl calc;
    @Test
    void menuSum() {
        calc = new CalcImpl();
        double sum = calc.menuSum(10000);
        BigDecimal bSum = new BigDecimal(sum);
        System.out.println(bSum);
    }

    @Test
    void storeName() {
        calc = new CalcImpl();
        String name = calc.storeName("01");
        assertEquals("Outback",name);
    }
}