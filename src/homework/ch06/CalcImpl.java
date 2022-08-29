package homework.ch06;

public class CalcImpl implements Calc{
    final static double fee = 0.1;
    @Override
    public double menuSum(int price) {
        return fee*price;
    }

    @Override
    public String storeName(String storeId) {
        String level;
        switch (storeId){
            case "01" : level = "Outback";
                break;
            case "02" : level = "Subway";
                break;
            case "03" : level = "Gongcha";
                break;
            default: level = "etc";
                break;
        }
        return level;
    }
}
