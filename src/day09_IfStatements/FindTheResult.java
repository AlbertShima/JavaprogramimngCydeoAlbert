package day09_IfStatements;
/*
Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50

 */
public class FindTheResult {
    public static void main(String[] args) {
        int a=9;
        if(a%3==0||a%5==0||a%15==0){
            if(a%15==0){
                a+=50;
            } else if(a%3==0 && a%5!=0){
                a+=20;
            } else {
                a += 25;

            }
            System.out.println(a);
        }
        System.out.println("The number is not multiple of 3,5 nor multiple of 15");
    }
}
