package day19_LoopPractices;

public class Hi {
    public static void main(String[] args) {
        String str = "hihi hjnchih";
        int frequency =0;
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i+2).equals("hi")){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}

