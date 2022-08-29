package homework;

public class Steak{
    private Food food = new Food(); //composition
    public  int foodPrice(){
        return 2000;
    }

    public static void main(String[] args){
        Steak steak = new Steak();

        System.out.println("Food Price="+steak.food.foodPrice()+", Steak Price="+steak.foodPrice());
    }
}