package ClassAndObjects;

public class Bottle {
    int capacity;
    String color;
    String material;

    void displayBottleDetails(){
        System.out.println("Bottle capacity: "+capacity+" litre");
        System.out.println("Bottle color: "+color);
        System.out.println("Bottle Material: "+material);
    }
}
class BottleTest{
    static void main(String[] args) {
        Bottle btl = new Bottle();
        btl.capacity = 2;
        btl.material = "Plastic";
        btl.color = "\"Navy Blue\"";

        btl.displayBottleDetails();
    }
}
