package fast.inheri;

public class CustomerTest {
    public static void main(String[] args){
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이유선");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
    }
}
