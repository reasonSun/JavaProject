package homework;

public class VIPCustomer{
    private Customer customer = new Customer();
    double bonusRatio;

    double saleRatio;
    private String agentID;

    public VIPCustomer() {
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customer.customerGrade = "GOLD";
    }

    public int calcPrice(int price){
        customer.bonusPoint += price * bonusRatio;

        return price;
    }

    public String getAgetID(){
        return agentID;
    }

}
