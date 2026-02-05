package MethodPractice.BasicMethodOverloading;

public class Math {
    public static int power(int num){
        return num* num;
    }
    public static int power(int num, int exponent){
        int result = 1;
        for (int i = 1; i <= exponent; i++){
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4 is: "+power(4));
        System.out.println("Exponential power of 4 is: "+power(4,4));
    }
}
