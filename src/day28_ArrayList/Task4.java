package day28_ArrayList;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();
        int i=0;

        for (String each1 : str1) {
            list.add(i, each1);
            i++;
        }
        for (String each2 : str2) {
            list.add(i, each2);
            i++;
        }

        System.out.println(list);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */