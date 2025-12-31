package ChallengeLevel01;

import java.util.Scanner;

public class PrimeNumberValidation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to check prime number: ");
        int n = scn.nextInt();
        int count=0;
        if (n<=1){
            System.out.println("Given number "+n+" is not a Prime number");
            return;
        }
        for (int i = 1; i<=n; i++){
            if(n%i==0) {
                count++;
            }
        }
        if (count==2){
            System.out.println("Given number "+n+" is a Prime number");
        }
        else {
            System.out.println("Given number "+n+" is not a Prime number");
        }
        scn.close();
    }
}