package homework;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    double bonusPoint;
    double bonusRatio;

    public Customer(){
    }
    public Customer(String customerGrade, double bonusRatio){
        this.customerGrade = customerGrade;
        this.bonusRatio = bonusRatio;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;

        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "입니다.";
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
