package MethodPractice.BasicMethodOverloading;

public class Printer {
    public static String print(String message){
        return message;
    }
    public static int print(int number){
        return number;
    }
    public static double print(double number){
        return number;
    }

    public static void main(String[] args) {
        System.out.println("String: "+print("Welcome to the Method overloading practice session"));
        System.out.println("Integer number: "+print(12562));
        System.out.println("Floating number: "+print(2465.25));
    }
}