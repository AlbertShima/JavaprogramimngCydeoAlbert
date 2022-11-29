package day35_Encapsulation.pizaa;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;
    public int totalCost;

    public String getSize() {
        return size;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            return;
        }
        this.size = size;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping > 0) {
            if (!((getSize().equalsIgnoreCase("small") && numberOfCheeseTopping <= 3)
                    || (getSize().equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4)
                    || (getSize().equalsIgnoreCase("large") && numberOfCheeseTopping <= 5))) {
                return;
            }
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping > 0) {
            if (!((getSize().equalsIgnoreCase("small") && numberOfPepperoniTopping <= 4)
                    || (getSize().equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 5)
                    || (getSize().equalsIgnoreCase("large") && numberOfPepperoniTopping <= 6))) {
                return;
            }
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    }

    public int calcCost() {
        if (size.equalsIgnoreCase("small")) {
            totalCost += 10 + 2 * getNumberOfCheeseTopping();
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost += 12 + 2 * numberOfCheeseTopping;
        } else {
            totalCost += 14 + 2 * numberOfPepperoniTopping;
        }
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + getSize() + '\'' +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ", total Cost=" + calcCost() +
                '}';

    }
}

/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping




 */