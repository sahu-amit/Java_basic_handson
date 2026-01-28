package MethodPractice.MethodsWithReturnTypes;

import java.util.Scanner;

public class Temperature {
    static double celsiusToFahrenheit(double celsius) {
        return ((celsius*9/5)+32);
    }

    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        System.out.println("Temperature in Fahrenheit is: "+celsiusToFahrenheit(celsius)+"°F");
    }
}
