package day18_NestedLoop;

public class Task5 {
    public static void main(String[] args) {
        String str = "aabccadeef";
        int count = 0;
        String temp ="";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            char ele1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ele2 = str.charAt(j);
                if (ele1 == ele2) {
                    count += 1;
                }
            }
            if(count==1){
                temp=""+ele1;
            }
        }
        System.out.println(temp);


    }


}
/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */