package ClassAndObjects;

public class Circle {
    double radius;
}

class Cir{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7.25;

        System.out.println(circle.radius);
    }
}
