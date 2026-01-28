package ChallengeLevel01;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to reverse: ");
        n = sc.nextInt();
        int reverse = 0;
        int remainder = 0;
        while(n>0){
            remainder = n%10;
            reverse = reverse*10+ remainder;
            n = n/10;
        }
        System.out.println("Reverse of provided number is: "+reverse);
    }
}