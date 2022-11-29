package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicates11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer integer : list) {
            if (!(list2.contains(integer))) {
                list2.add(integer);
            }
        }
        System.out.println(list2);
    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */