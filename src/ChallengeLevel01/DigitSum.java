package ChallengeLevel01;

import java.util.Scanner;

public class DigitSum {
    static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = 0;
        int digit;
        int m = n;
        while (n>0){
            digit = n%10;
            remainder = remainder + digit;
            n= n/10;
        }
        System.out.print("Sum of Digits of number "+m+" is: " +remainder);
        sc.close();
    }
}