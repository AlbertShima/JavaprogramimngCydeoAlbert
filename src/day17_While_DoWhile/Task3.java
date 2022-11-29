package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        double num2 = scanner.nextInt();
        System.out.println("Enter your math operator +, -, /, *");
        char mathOperator = scanner.next().charAt(0);

        while (!(mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/')) {
            System.out.println("Enter a math operator-(+, -, *, /)");
            char ch = scanner.next().charAt(0);
        }
        if (mathOperator == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperator == '-') {
            System.out.println(num1 - num2);
        } else if (mathOperator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }

    }

}
/*
 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator,
		ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */