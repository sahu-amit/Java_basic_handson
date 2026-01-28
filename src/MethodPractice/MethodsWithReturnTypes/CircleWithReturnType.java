package MethodPractice.MethodsWithReturnTypes;

public class CircleWithReturnType {
    static double getArea(int radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle is: "+getArea(29));
    }
}
