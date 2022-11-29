package day31_Constructors.Task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        BMW car1 = new BMW("BMW","x5", "white", 35500, 200, 2001, LocalDate.now());
        BMW car2 = new BMW("BMW","x5", "blue", 30050, 100, 2022, LocalDate.now());
        BMW car3 = new BMW("BMW","x6", "red", 30060, 100, 2019, LocalDate.now());
        BMW car4 = new BMW("BMW","x5", "white", 35070, 200, 2016, LocalDate.now());
        BMW car5 = new BMW("BMW","x5", "black", 36000, 100, 2014, LocalDate.now());
        BMW car6 = new BMW("BMW","x6", "gray", 32070, 100, 2017, LocalDate.now());

        ArrayList<BMW> listBefor2017 =new ArrayList<>(Arrays.asList(car1, car2, car3));

        System.out.println(listBefor2017);

    }
}
