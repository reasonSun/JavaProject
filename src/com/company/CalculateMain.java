package com.company;

public class CalculateMain {
    public static void main(String [] args){
        CalculateMain calculate = new CalculateMain();
        calculate.calculateLambda();
    }

    public void calculateLambda(){
        Calculate calculate = (a, b) -> a+b;
        System.out.println(calculate.operation(1,2));
        Calculate calculateSubtract = (a, b) -> a-b;
        System.out.println(calculateSubtract.operation(2,2));
    }
}
