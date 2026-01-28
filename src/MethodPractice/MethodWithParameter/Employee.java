package MethodPractice.MethodWithParameter;

public class Employee {
    static void showSalary(String name, double salary){
        System.out.println("My name is "+name+" working in TCS");
        System.out.println("My current earning is: "+salary);
    }

    public static void main(String[] args) {
        showSalary("Amit Sahu", 35000.250);
    }
}