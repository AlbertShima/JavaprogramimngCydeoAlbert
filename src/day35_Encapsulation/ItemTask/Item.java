package day35_Encapsulation.ItemTask;

public class Item {
    private String name;
    private int unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    /*
    name can not be empty or blank
    name can not contain any special characters other than space
    name must start with letters
     */
    public void setName(String name) {
        name = name.toLowerCase();
        if (name.isEmpty()) {
            return;
        }
        if (!Character.isLetter(name.charAt(0))) {
            return;
        }
        for (char ch : name.toCharArray()) {
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || (ch == ' '))) {
                return;
            }
        }
        this.name = name;
    }

    /*
    unit price can not be negative
     */
    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    /*
    quantity can not be negative
    if the Item name is toilet paper (case-insensitive) then the quantity can not be more than 1
     */

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        }
        if (getName().equalsIgnoreCase("toilet paper")) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }

    public void setInfo(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case-insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */