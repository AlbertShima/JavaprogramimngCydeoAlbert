package day09_IfStatements;
/*
Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4

 */

public class CalculateCarTax {
    public static void main(String[] args) {
        int price = 81000;
        if (price >= 20000 && price <= 80000) {
            if (price >= 20000 && price <= 39999) {
                price += -price * 0.2;
            } else if (price <= 59999) {
                price += -price * 0.3;
            } else if (price >= 60000) {
                price += -price * 0.4;
            }
            System.out.println(price);
        } else {
            System.out.println("Wooowwww");
        }

    }
}
