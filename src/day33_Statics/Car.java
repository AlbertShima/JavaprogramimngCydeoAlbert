package day33_Statics;

public class Car {
    public String make, color;
    public static String model;
    public int year;
    public double price;
    public static int numberOfWheels;
    public static boolean hasBattery;
    public static boolean hasSeats;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String drive(){
        return make+" "+model+" with "+color+" color, "+year+" defrim is driving";
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", " + drive()+
                '}';
    }
}
/*
7. Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()

 */