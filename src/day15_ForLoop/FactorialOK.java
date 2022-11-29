package day15_ForLoop;

public class FactorialOK {
    public static void main(String[] args) {
        int num = 6;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */