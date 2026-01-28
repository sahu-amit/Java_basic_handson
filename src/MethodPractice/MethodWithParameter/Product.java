package MethodPractice.MethodWithParameter;

public class Product {
    void display(String productName, double price){
        System.out.println("Product name is: "+productName);
        System.out.println("Final price of the "+productName+" is: "+price);
    }

    public void main(String[] args) {
        display("Wheel Active", 75.58);
    }
}