package MethodPractice.MethodWithParameter;

public class Calculator {
    static void add(int a, int b){
        int result = a + b;
        System.out.println("Sum of a & b is: "+result);
    }
    static void multiply(int a, int b){
        int result = a*b;
        System.out.println("Product of a & b is: "+result);
    }

    public static void main(String[] args) {
        add(16, 32);
        multiply(12, 18);
    }
}
