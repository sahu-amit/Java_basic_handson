package Challenges;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        A = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        B = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        C = sc.nextInt();
        int MAX;
        if (A>=B && A>=C) {
//            System.out.println("Greatest number is: " + A);
//            if (A%2==0){
//            System.out.println(A+ " is a Even number");
//            }
//            else {
//                System.out.println(A + " is a Odd number");
//            }
            MAX = A;
        }
        else if (B>=A && B>=C) {
            MAX = B;
//            System.out.println("Greatest number is: "+B);
//            if (B%2==0){
//                System.out.println(B+ " is a Even number");
//            }
//            else {
//                System.out.println(B + " is a Odd number");
//            }
        }
        else {
            MAX = C;
//            System.out.println("Greatest number is: " + C);
//            if (C % 2 == 0) {
//                System.out.println(C + " is a Even number");
//            } else {
//                System.out.println(C + " is a Odd number");
//            }
        }
        System.out.println("Greatest number is: "+MAX);

        if (MAX%2==0){
            System.out.println(MAX+" is an Even number");
        }
        else
            System.out.println(MAX+" is an Odd number");
    }
}
