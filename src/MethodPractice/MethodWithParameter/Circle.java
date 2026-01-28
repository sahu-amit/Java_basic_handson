package MethodPractice.MethodWithParameter;

public class Circle {
    static void calculateArea(int radius){
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle is: "+area);
    }

    public static void main(String[] args) {
        calculateArea(7);
    }
}