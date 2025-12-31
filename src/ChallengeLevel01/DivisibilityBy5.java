package ChallengeLevel01;

import java.util.Scanner;

public class DivisibilityBy5 {
    public static void main(String[] args) {
        System.out.print("Enter the number to check divisibility of 5: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%5==0){
            System.out.println("Number "+n+" is divisible by 5");
        }
        else {
            System.out.println("Number "+n+" is not divisible by 5");
        }
        sc.close();
    }
}
