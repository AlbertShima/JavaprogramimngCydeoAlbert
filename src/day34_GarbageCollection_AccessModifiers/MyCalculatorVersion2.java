package day34_GarbageCollection_AccessModifiers;

public class MyCalculatorVersion2 {
    public int num1;
    public int num2;

    public MyCalculatorVersion2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus() {
        return num1+num2;
    }
    public int minus() {
        return num1-num2;
    }
    public int multiply() {
        return num1*num2;
    }
    public int divide() {
        return num1/num2;
    }

}
class TestVersion2{
    public static void main(String[] args) {
        MyCalculatorVersion2 myCal2 = new MyCalculatorVersion2(2, 3);
        System.out.println("Addition");
        System.out.println(myCal2.plus());
        System.out.println("Subtraction");
        System.out.println(myCal2.minus());
        System.out.println("Multiplication");
        System.out.println(myCal2.multiply());
        System.out.println("Division");
        System.out.println(myCal2.divide());
    }
}


/*
version 2: with instance variables and with a setInfo method (or constructor)
that sets value to integers which will be used in instance methods of the class we create
for example:
MyCalculatorV2 myCal2 = new MyCalculatorV2();
myCal2.setInfo(1,1);
myCal.plus();
returns:2
myCal.minus();
returns:0

 */
