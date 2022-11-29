package day19_LoopPractices;

public class PrintAllDoubleCharOK {

    public static void main(String[] args) {
        String str = "abeiiejccdsfgsjhgsadgdgdgjsdjagdgfggfgfg";
        String temp = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string

            for (int i = j + 1; i < str.length(); i++) {
                char each = str.charAt(i); // each character of str

                if (ch == each && i == j + 1) {
                    temp += "" + ch + ch;

                }
            }
        }
        System.out.println(temp);
    }
}

/*
Write a program that can return the first duplicated character from a string
 */
/*
3. Write a program that can display all the characters that appeared twice in the string.
 */