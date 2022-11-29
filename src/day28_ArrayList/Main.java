package day28_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            if (!(result.get(i).equals("nanuk"))) {
                sum = sum + Integer.parseInt(result.get(i));
            } else {
                wayStones--;
            }
        }
        if (wayStones > 0 && sum > boast) {
            return true;
        } else {
            return false;
        }
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

}