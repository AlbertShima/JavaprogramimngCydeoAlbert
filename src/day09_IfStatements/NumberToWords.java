package day09_IfStatements;

public class NumberToWords {
    public static void main(String[] args) {
        int x = 10;
        String result = (x <= 9 && x >= 0) ?
                (x == 0) ? "zero"
                        : (x == 1) ? "one"
                        : (x == 2) ? "two"
                        : (x == 3) ? "three"
                        : (x == 4) ? "four"
                        : (x == 5) ? "five"
                        : (x == 6) ? "six"
                        : (x == 7) ? "seven"
                        : (x == 8) ? "eight"
                        : "nine"
                : "invalid number";
        System.out.println(result);
    }
}
