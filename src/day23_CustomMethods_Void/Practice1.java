package day23_CustomMethods_Void;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        convertingSentenceToCharArray("albert shima");
        convertingSentenceToCharArray("qwertzuiop asdfghjkl yxcvbnm");
    }

    public static void convertingSentenceToCharArray(String word) {
        //Removing spaces from the string
        word = word.replaceAll("\\s", "");
        //creating a char array with each letter using for loop
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
        // printing the elements of char array using for loop
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        //sorting the char array and then printing with for loop
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
    }
}
