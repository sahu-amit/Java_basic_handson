package MethodPractice.BasicMethodOverloading;

public class Display {
    public static void show(){
        System.out.println("This is non parameterized method");
    }
    public static int show(int a, int b){
        return a+b;
    }
    public static double show(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        show();
        System.out.println("Sum of 2 numbers is: "+show(5,35));
        System.out.println("Product of 2 numbers is: "+show(32,25.25));
    }
}
