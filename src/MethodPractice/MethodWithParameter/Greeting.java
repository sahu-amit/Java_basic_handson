package MethodPractice.MethodWithParameter;

public class Greeting {
    static void sayHello(String name){
        System.out.println("Welcome "+name+" to my new Home ");
    }

    public static void main(String[] args) {
        sayHello("Rahul");
    }
}