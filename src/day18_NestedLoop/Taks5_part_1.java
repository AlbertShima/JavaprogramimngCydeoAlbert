package day18_NestedLoop;

import java.util.Scanner;

public class Taks5_part_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.next();
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            String ele1 = str.substring(i, i + 1);

            for (int j = 0; j < str.length(); j++) {
                String ele2 = str.substring(j, j + 1);
                if (ele1.equals(ele2) && i!=j) {
                    counter+=1;
                    break;
                }
            }
            if(counter==0){
                temp+=ele1;
            }
        }
        System.out.println(temp);
    }
}
