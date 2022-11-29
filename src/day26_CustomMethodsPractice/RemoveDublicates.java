package day26_CustomMethodsPractice;

import utilities.StringUtility;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if (!result.toString().contains("" + each)) {
                result.append(each);
            }
        }
        return result.toString();
    }






}

