package ChallengeLevel01;

import java.util.Scanner;

public class CheckNumberGreaterThan100 {
    public static void main(String[] args) {
        System.out.print("Enter the number to check: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==100){
            System.out.println("Number " + n + " is equal to 100");
        } else if (n>100) {
            System.out.println("Number " + n + " is greater than 100");
        }
        else {
            System.out.println("Number " + n + " is less than 100");
        }
        sc.close();
    }
}
