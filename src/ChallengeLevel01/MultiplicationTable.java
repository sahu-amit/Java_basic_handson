package ChallengeLevel01;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want Multiplication table: ");
        n = sc.nextInt();
        System.out.println("Multiplication table of number "+n+" is");
        for (int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}