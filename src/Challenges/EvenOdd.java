package Challenges;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    int A;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number to check: ");
    A = sc.nextInt();
    if (A%2==0)
        System.out.println(A+" is an Even Number");
    else
        System.out.println(A+" is an Odd number");
    }
}
