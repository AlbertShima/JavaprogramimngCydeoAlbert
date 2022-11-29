package day23_CustomMethods_Void;

public class PractiseTask15 {
    public static void main(String[] args) {
        calculator(3, 5, "+");
        calculator(-4, 3, "-");
        calculator(-4, 7, "*");
        calculator(32, 4, "/");
    }

    public static void calculator(int num1, int num2, String operator) {
        System.out.println("The given numbers are: " + num1 + " " + num2);
        double result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Their sum is " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Their difference is " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Their multiplication is " + result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            System.out.println("Their division is " + result);
        } else {
            System.out.println("Invalid operator or num1, num1");
        }
    }
}
/*
15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
prints the calculation result
 */