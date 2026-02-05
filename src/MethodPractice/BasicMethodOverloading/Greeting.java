package MethodPractice.BasicMethodOverloading;

public class Greeting {
    public static String greet(){
        return "Hello";
    }
    public static String greet(String name){
        return "Hello "+name;
    }
    public static String greet(String name, String time){
        return "Good "+time+" "+name;
    }

    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(greet("Amit"));
        System.out.println(greet("Amit", "Evening"));
    }
}
