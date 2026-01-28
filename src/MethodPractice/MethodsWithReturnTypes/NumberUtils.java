package MethodPractice.MethodsWithReturnTypes;

import java.util.Scanner;

public class NumberUtils {
    static boolean isEven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to check even numbers: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Given numbers is Even: "+isEven(num));
    }
}
