package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        System.out.println("----------Each character--------------");
        String str = "Java programing language";
        StringUtility.printEachChar(str);
        System.out.println();
        System.out.println("----------Reverse--------------");
        String reverse = StringUtility.reverse(str);
        System.out.println(reverse);
        System.out.println("----------Palindrome--------------");
        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("Is \"" + word + "\" a palindrome? --> " + palindrome);
        System.out.println("----------Array Palindrome--------------");

        String[] names = {"Anna", "Java", "Python", "Mom"};
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                System.out.println(each);
            }
        }
        System.out.println("----------Remove Duplicates--------------");
        String s2 = "aaaabbbbccccdddeecc";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println("nonDup = " + nonDup);
    }
}
