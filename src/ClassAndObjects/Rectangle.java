package ClassAndObjects;

public class Rectangle {
    double length;
    double width;
}

class Rect{
    public static void main(String[] args) {

    Rectangle rct = new Rectangle();
    rct.length = 24.00;
    rct.width = 26;

    System.out.println("Length of Rectangle is: "+rct.length);
    System.out.println("Width of Rectangle is: "+rct.width);
    }
}
