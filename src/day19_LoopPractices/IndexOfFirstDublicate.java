package day19_LoopPractices;

public class IndexOfFirstDublicate {
    public static void main(String[] args) {
        String str = "abcjccd";

        int index =0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each character of str

                if (ch == each && i != j) {
                    index =i;
                    System.out.println(index);
                    System.exit(0);
                }
            }
        }
    }
}
/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */

