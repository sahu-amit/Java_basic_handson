package ChallengeLevel01;

import java.util.Scanner;

public class NumberSwappingWithoutThirdVariable {
    static void main(String[] args) {
        System.out.print("Enter 1st Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println();

        System.out.println("After swapping 1st number is: "+a);
        System.out.println("After swapping 2nd number is: "+b);

        System.out.println();
//      Using Multiplication
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After 2nd swapping 1st number is: "+a);
        System.out.println("After 2nd swapping 2nd number is: "+b);

    }
}
