package day19_LoopPractices;

public class PyramidWithStarOK {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = 2 * (10 - i); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }
}
