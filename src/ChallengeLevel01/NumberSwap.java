package ChallengeLevel01;

import java.util.Scanner;

public class NumberSwap {
    static void main(String[] args) {
        System.out.print("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.println("After swapping the value of a: "+a);
        System.out.println("After swapping the value of b: "+b);
        sc.close();
    }
}