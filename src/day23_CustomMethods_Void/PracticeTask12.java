package day23_CustomMethods_Void;

public class PracticeTask12 {
    public static void main(String[] args) {

        typeOfANumber(23);
        typeOfANumber(-33);
        typeOfANumber(0);
    }

    public static void typeOfANumber(int number) {
        if (number > 0) {
            System.out.println("the number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("the number " + number + " is negative");
        } else {
            System.out.println("the number is zero");
        }
    }
}
/*
12. create a method that can if the given integer is positive, negative or zero
 */