package day19_LoopPractices;

public class Task6_HighestFreqOK {
    public static void main(String[] args) {

        String str = "aaaabcbcbcbbbvb";

        int maxOfFrequency = 0;

        for (int i = 0; i <str.length() ; i++) {
            int frequency = 1;
            char ch = str.charAt(i);
            for (int j = i+1; j < str.length()-1; j++) {
                if (ch == str.charAt(j) && j!=i) {
                    frequency+=1;
                    if(maxOfFrequency<=frequency){
                        maxOfFrequency=frequency;
                    }
                }

            }

        }
        System.out.println(maxOfFrequency+1);
    }
}
