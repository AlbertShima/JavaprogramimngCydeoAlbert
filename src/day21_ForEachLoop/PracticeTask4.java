package day21_ForEachLoop;

public class PracticeTask4 {
    public static void main(String[] args) {
        String[] arr = {"anna", "level", "Java"};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i].substring(0, arr[i].length() / 2));
            System.out.println(arr[i].substring(arr[i].length() / 2));
            if (arr[i].substring(0, arr[i].length() / 2).equals(arr[i].substring(arr[i].length() / 2))){
                count++;
            }
        }
        System.out.println(count);


    }
}
/*
    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */