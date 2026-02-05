package MethodPractice.BasicMethodOverloading;

public class AreaCalculator {
    public static int calculateArea(int side){
        return side*side;
    }
    public static int calculateArea(int length, int width){
        return length*width;
    }

    public static void main(String[] args) {
        System.out.println("Area of Square is: "+calculateArea(39));
        System.out.println("Area of Rectangle is: "+calculateArea(151, 67));
    }
}