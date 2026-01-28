package MethodPractice.BasicMethods;

public class Bird {
    void fly(){
        System.out.println("Bird is flying...");
    }

    public static void main(String[] args) {

        Bird brd = new Bird();
        brd.fly();
    }
}