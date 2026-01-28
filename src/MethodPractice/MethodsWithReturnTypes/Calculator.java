package MethodPractice.MethodsWithReturnTypes;

public class Calculator {
    static int addAndReturn(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int multiplyAndReturn(int a, int b){
        int multiplication = a * b;
        return multiplication;
    }

    public static void main(String[] args) {
        System.out.print("Sum of the number is: ");
        System.out.println(addAndReturn(35, 93));
        System.out.print("Multiplication of number is: ");
        System.out.println(multiplyAndReturn(13, 89));
    }
}
