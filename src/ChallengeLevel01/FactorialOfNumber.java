package ChallengeLevel01;

import java.util.Scanner;

public class FactorialOfNumber {
    static void main(String[] args) {
        System.out.print("Enter the number to check factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for (long i = 1; i<=n; i++){
            fact = i*fact;
        }
        System.out.println("Factorial of number "+ n + " is: "+fact);
        sc.close();
    }
}
