package day19_LoopPractices;

public class IndexOfUnicChar {
    public static void main(String[] args) {

        String str = "aabbcc88zcdeef";

        int unicIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    frequency = 1;
                    break;
                }
            }
            if (frequency == 0) {
                unicIndex = i;
                break;
            }
        }
        System.out.println(unicIndex);
    }
}


/*
4. Write a program that can return the index number of the first unique character.
 */