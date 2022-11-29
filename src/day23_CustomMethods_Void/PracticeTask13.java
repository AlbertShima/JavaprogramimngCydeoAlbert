package day23_CustomMethods_Void;

public class PracticeTask13 {
    public static void main(String[] args) {
        String str = "I am learning how to create and call \n  a method in java programming language";
        printEachChar(str);
    }
    public static void printEachChar(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }

    }
}
/*
13. create a method named printEachChar that can print each characters of a string

 */