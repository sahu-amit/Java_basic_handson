package MethodPractice.MethodWithParameter;

public class Rectangle {
    static void calculateArea(int length, int width){
        int area = length*width;
        System.out.println("Area of Rectangle: "+area+" sq cm");
    }

    public static void main(String[] args) {
        calculateArea(63, 35);
    }
}
