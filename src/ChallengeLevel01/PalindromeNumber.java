package ChallengeLevel01;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome: ");
        int n = sc.nextInt();
        int reverse = 0;
        int remainder;
        int m = n;
        while (n>0){
            remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }
        if (reverse == m){
            System.out.println("Number "+reverse+ " is a palindrome number");
        }
        else {
            System.out.println("Number "+m+ " is not a palindrome number");
        }
        sc.close();
    }
}
