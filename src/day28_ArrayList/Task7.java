package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
