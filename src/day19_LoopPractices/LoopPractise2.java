package day19_LoopPractices;

public class LoopPractise2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * * *
         */
        System.out.println();
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println();

            for (int j = 2*(10-i); j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
        }
        /*          *
                  * *
                * * *
              * * * *
            * * * * *
          * * * * * *
        * * * * * * *
      * * * * * * * *
    * * * * * * * * *
  * * * * * * * * * *
* * * * * * * * * * *
         */
        System.out.println();
        System.out.println("-----------------------------------------------------");

        for (int i = 10; i >=0 ; i--) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
        /*
         * * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        System.out.println();
        System.out.println("-----------------------------------------------------");

        for (int i = 10; i >=0 ; i--) {
            System.out.println();

            for (int j = 2*(10-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
        /*
         * * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

    }
}
