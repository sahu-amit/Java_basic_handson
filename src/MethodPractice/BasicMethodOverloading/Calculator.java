package MethodPractice.BasicMethodOverloading;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of numbers are: "+add(1.00,2));
        System.out.println("Sum of numbers are: "+add(1.00,2.25));
        System.out.println("Sum of numbers are: "+add(1,2.98));
        System.out.println("Sum of numbers are: "+add(1,2));
        System.out.println("Sum of numbers are: "+add(1,2, 3));
    }
}
