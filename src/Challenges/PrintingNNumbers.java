package Challenges;

import java.util.Scanner;

public class PrintingNNumbers {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i =1; i<=n; i++){
            System.out.println(i);
        }
    }
}
