package day35_Encapsulation.carpetTask;

/*
Carpet Task
		3.1create a class named Carpet:
 */
public class Carpet {
    /*
    private variables:
    width, length, unitPrice, isPersian (boolean)
     */
    private int width, length;
    private double unitPrice;
    private boolean isPersian;

    public int getWidth() {
        return width;
    }

    //width can not be negative
    public void setWidth(int width) {
        if (!(width > 0)) {
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    //width can not be negative
    public void setLength(int length) {
        if (!(length > 0)) {
            return;
        }
        this.length = length;
    }


    public double getUnitPrice() {
        return unitPrice;
    }
    //unit price can not be negative
    public void setUnitPrice(double unitPrice) {
        if (!(unitPrice > 0)) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    //Add a constructor to set all the instances
    public void setInfo(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    //instance methods:
    //calcCost(): should be able to calculate the total cost of the carpet and return it as double
    //total price of carpet = (width*length)*unitPrice
    //if the carpet is persian  carpet, add 200$ to the totalPrice

    public double calcCost(){
        if(isPersian){
            return 200+(width*length)*unitPrice;
        } else{
            return (width*length)*unitPrice;
        }
    }
   // toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=" + calcCost() +
                '}';
    }
}

