package day35_Encapsulation.ItemTask;

public class ItemTest {
    public static void main(String[] args) {
        Item item = new Item();

        item.setName("toilet paper");
        item.setQuantity(5);
        item.setUnitPrice(1);
        System.out.println(item.getName() + " : " + item.getQuantity() + " : " + item.getUnitPrice());

    }
}
