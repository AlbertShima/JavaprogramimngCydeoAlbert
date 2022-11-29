package day20_Arrays;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            String reverse = "";

            for (int j = 0; j < arr[i].length(); j++) {
                reverse = reverse + "" + arr[i].charAt(arr[i].length() - 1 - j);
            }
            System.out.println(reverse);
        }
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */