package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber =1;

        if (gradeNumber==1) {
            System.out.println("location- Apple orchard \nnumber of groups -3 \nteacher in charge - Ms. Smith");
        } else if (gradeNumber==2) {
            System.out.println("location- Zoo \nnumber of groups - 7 \nteacher in charge - Mr. Lee");
        } else if (gradeNumber==3) {
            System.out.println("location - Aquarium \nnumber of groups 5 \nteacher in charge - Ms. Wilson");
        } else if (gradeNumber==4) {
            System.out.println("location - Movie theater \n number of groups - 2 \nteacher in charge - Ms. Reyes");
        } else if (gradeNumber==5) {
            System.out.println("location - Museum \nnumber of groups - 5 \nteacher in charge - Ms. Lela");
        } else if (gradeNumber==6) {
            System.out.println("location - six Flags \nnumber of groups - 8 \nteacher in charge - Mr. Watt");
        } else {
            System.out.println("Invalid Grade Number");  }
    }
}
