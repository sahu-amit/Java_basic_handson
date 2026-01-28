package MethodPractice.MethodWithParameter;

public class Student {
    static void showDetails(String name, int age){
        System.out.println("My name is "+name+" and I am "+age+" year old");
    }

    public static void main(String[] args) {
        showDetails("Ranjeet", 29);
    }
}
