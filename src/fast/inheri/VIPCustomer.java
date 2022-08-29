package fast.inheri;

public class VIPCustomer extends Customer {
    double bonusRatio;

    double saleRatio;
    private String agentID;

    public VIPCustomer() {
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "GOLD";
    }

    public String getAgetID(){
        return agentID;
    }

}
