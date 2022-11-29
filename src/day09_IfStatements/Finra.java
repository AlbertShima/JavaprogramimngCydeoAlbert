/*
3. Create a class called FINRA, Write a function which prints out the number.
but for number which is a multiple of 3, print "FIN" instead of the number and for number
which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of
both 3 and 5, print "FINRA" instead of the number.

 */
package day09_IfStatements;

public class Finra {
    public static void main(String[] args) {
        int finra = 31;
        String result = (finra % 3 == 0) ? "FIN"
                : (finra % 5 == 0) ? "RA"
                : (finra % 15 == 0) ? "FINRA"
                : "Please enter a multiple number of 3, 5 or 15";
        System.out.println(result);
    }
}
