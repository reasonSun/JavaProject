package homework.ch06;

public class Burger extends CalcImpl{
    private int basicPrice = 2500;
    public int menuId;

    public int getBasicPrice() {
        return basicPrice;
    }
    @VisibleForTesting
    int sum(int a, int b){
        int tot = a* b;
        return tot;
    }
    public String menuName(int menuId){
        this.menuId = menuId;
        String menu;

        if(this.menuId == 1){
            menu = "burger";
        }else if(this.menuId == 2){
            menu = "coke";
        }else if(this.menuId == 3){
            menu = "french fries";
        }else {
            menu = "etc";
        }
        return menu;
    }

    @Override
    public double menuSum(int price) {
        double menuPrice;

        if(this.menuId == 1){
            menuPrice = basicPrice + price + 200;
        }else if(this.menuId == 2){
            menuPrice = basicPrice + price + 300;
        }else if(this.menuId == 3){
            menuPrice = basicPrice + price + 400;
        }else {
            menuPrice = basicPrice + price + 500;
        }
        return menuPrice;
    }
}
