package homework;

public class Food {
    protected int fee = 100;
    protected int[] foodOption;

//    public Food(int[] foodOption){
//        this.foodOption = foodOption;
//    }
    public int foodPrice(){
        return 5000+fee;
    }
}
