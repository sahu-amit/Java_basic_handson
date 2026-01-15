package ClassAndObjects;

public class Car {
    int model;
    String color;
    float speed;
}

class C1{
    public static void main(String[] args) {
        Car car = new Car();
        car.model = 2025;
        car.color = "Vibrant Red";
        car.speed = 185.50f;
        System.out.println();

        System.out.println("Car Details as below");
        System.out.println();
        System.out.println("Model: "+car.model);
        System.out.println("Color: "+car.color);
        System.out.println("Speed: "+car.speed);
    }
}
