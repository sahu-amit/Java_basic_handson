package ChallengeLevel01;

import java.util.Scanner;

public class SkippingMultiples {
    static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + " skipping multiples of 5:");
        for (int i = 1; i<=n; i++){
            if (i%5!=0){
                System.out.print(i+"\t");
            }
        }
        sc.close();
    }
}