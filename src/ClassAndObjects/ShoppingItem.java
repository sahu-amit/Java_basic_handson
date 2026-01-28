package ClassAndObjects;

public class ShoppingItem {
    String itemName;
    int quantity;
    double price;

    double totalCost(){
        return price*quantity;
    }
}
class ShoppingItemTest{
    static void main(String[] args) {
        ShoppingItem SI = new ShoppingItem();
        SI.itemName = "Detergent Powder";
        SI.quantity = 17;
        SI.price = 135.46;
        System.out.println("Total Cost of "+SI.itemName+" is : " +SI.totalCost());
    }
}
