package ClassAndObjects;

public class Pen {
    String brand;
    String color;
    int price;

}
class PenTest{
    static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.brand = "Cello";
        pen1.color = "Blue";
        pen1.price = 15;

        Pen pen2 = new Pen();
        pen2.brand = "Lexi";
        pen2.color = "Blue";
        pen2.price = 10;

        Pen pen3 = new Pen();
        pen3.brand = "Natraj";
        pen3.color = "Blue";
        pen3.price = 12;

        Pen pen4 = new Pen();
        pen4.brand = "Reynold";
        pen4.color = "Blue";
        pen4.price = 35;

        Pen pen5 = new Pen();
        pen5.brand = "LINC";
        pen5.color = "Blue";
        pen5.price = 25;

        System.out.println("Pen1: "+pen1.brand+" | "+pen1.color+" | "+pen1.price);
        System.out.println("Pen2: "+pen2.brand+" | "+pen2.color+" | "+pen2.price);
        System.out.println("Pen3: "+pen3.brand+" | "+pen3.color+" | "+pen3.price);
        System.out.println("Pen4: "+pen4.brand+" | "+pen4.color+" | "+pen4.price);
        System.out.println("Pen5: "+pen5.brand+" | "+pen5.color+" | "+pen5.price);
    }
}
