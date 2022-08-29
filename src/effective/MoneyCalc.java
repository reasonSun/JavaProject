package effective;

import java.math.BigDecimal;

public class MoneyCalc {
    public static void main(String[] args){
        MoneyCalc test = new MoneyCalc();
        test.decimal();
        System.out.println("==========================");
        test.primitive();
    }

    public void decimal(){
        long start = System.currentTimeMillis();
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENTS;
            funds.compareTo(price)>=0;
            price = price.add(TEN_CENTS)){
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈(달러) : "+funds);

        long finish = System.currentTimeMillis();
        long times = finish - start;

        System.out.println("Time :"+times/1000.0);
    }

    public void primitive(){
        long start = System.currentTimeMillis();
        int itemsBought = 0;
        int funds = 100;
        for(int price = 10; funds >= price; price +=10){
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈(달러) : "+funds);

        long finish = System.currentTimeMillis();
        long times = finish - start;

        System.out.println("Time :"+times/1000.0);
    }
}
