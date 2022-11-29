package day35_Encapsulation.pizaa;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.setSize("small");
        pizza1.setNumberOfCheeseTopping(1);
        pizza1.setNumberOfPepperoniTopping(1);

        System.out.println("pizza1 = " + pizza1.calcCost());
        pizza1.setSize("medium");
        pizza1.setNumberOfCheeseTopping(1);
        pizza1.setNumberOfPepperoniTopping(1);
        System.out.println("pizza1 = " + pizza1.calcCost());

        pizza1.setSize("large");
        pizza1.setNumberOfCheeseTopping(1);
        pizza1.setNumberOfPepperoniTopping(1);
        System.out.println("pizza1 = " + pizza1.calcCost());
    }
}
