/*
4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full.
                Above 80 -  Still okay.
                Above 70 -  Don't go too far.
                Above 60 -  Start to head back.
                Above 50 -  Be careful now you at 50%.
                USE ONE PRINT STATEMENT ONLY
 */
package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenTank = 43;
        String result =   (oxygenTank <= 100 && oxygenTank > 0) ?
                          (oxygenTank >= 90) ? "Your tank is full"
                        : (oxygenTank >= 80) ? "Still okay"
                        : (oxygenTank >= 70) ? "Don't go too far"
                        : (oxygenTank >= 60) ? "Start to head back"
                        : (oxygenTank >= 50) ? "Be careful now you at 50%"
                        : "Your tank is almost empty" : "Enter a valid number";
        System.out.println(result);

    }
}
