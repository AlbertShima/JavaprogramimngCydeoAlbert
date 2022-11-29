package day18_NestedLoop;

public class GetUnicCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency =0;
            for (int j =0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    frequency =1;
                    break;
                }
            }
            if(frequency ==0){
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf()
 methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
if frequency of a character == 1  =========> unique

 */