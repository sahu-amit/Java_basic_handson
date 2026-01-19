package ClassAndObjects;

public class Laptop {
    String brand;
    int ram;
    int price;
}

class Lptp{
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.brand = "Lenovo";
        laptop.ram = 16;
        laptop.price = 79999;

        System.out.println("Brand of the Laptop is: "+laptop.brand);
        System.out.println("RAM(GB) in the Laptop is: "+laptop.ram);
        System.out.println("Price of the Laptop is: "+laptop.price);
    }
}
