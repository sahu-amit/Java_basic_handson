package ClassAndObjects;

public class Mobile {
    String brand;
    String model;
    int price;
}

class Mb{
    public static void main(String[] args) {
        Mobile mbl = new Mobile();
        mbl.brand = "Samsung";
        mbl.model = "Galaxy S24 Ultra 5G AI";
        mbl.price = 139999;

        System.out.println("Brand of the Mobile is: "+mbl.brand);
        System.out.println("Model of the Mobile is: "+mbl.model);
        System.out.println("Price of the Mobile is: "+mbl.price);
    }
}
