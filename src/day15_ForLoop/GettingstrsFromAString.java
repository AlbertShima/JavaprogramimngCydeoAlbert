package day15_ForLoop;

public class GettingstrsFromAString {
    public static void main(String[] args) {

        String str = "A1B2C37";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sum = sum + str.charAt(i) - 48;
            }
        }
        System.out.println(sum);

    }
}
