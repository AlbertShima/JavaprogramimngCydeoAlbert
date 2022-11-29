package day19_LoopPractices;

public class HighestFreq {
    public static void main(String[] args) {
        String str = "abdbbsd";


        int maxCount = 0;
        String maxfreq = "";

        for (int i = 0; i < str.length(); i++) {
            char ele1 = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                char ele2 = str.charAt(j);

                if (ele1 == ele2) {
                    count += 1;
                }
            }

            if (maxCount <= count) {
                maxCount = count;       // 3
                maxfreq = "" + ele1;    //b
            }
        }

        System.out.println(maxCount);
        System.out.println(maxfreq);

    }
}
/*
6.  Write a program that can find the character that has the highest frequency from a string
 */