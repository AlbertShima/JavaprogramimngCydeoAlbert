package day33_Statics;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", "white", 2022, 35000);

        Car car2 = new Car("Benc", "220", "white", 2023, 2000);
        System.out.println(car1.drive());
        System.out.println(car2.drive());

    }
}
