package ClassAndObjects;

public class Calculator {
    int add() {
        int a = 10;
        int b = 7;
        return a + b;
    }
    int substract(){
        int a = 15;
        int b = 8;
        return a - b;
    }
}

class Clc{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add());
        System.out.println(calc.substract());
    }
}
