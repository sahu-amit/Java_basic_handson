package ClassAndObjects;

public class Square {
    double side;

    double area(){
        return side*side;
    }
    double perimeter(){
        return 4*side;
    }
}
class Sqr{
    public static void main(String[] args) {
        Square square = new Square();
        square.side = 36.00;
        System.out.println("Area of the Square is: "+square.area()+" sq cm");
        System.out.println("Perimeter of the Square is: "+square.perimeter()+" cm");
    }
}
