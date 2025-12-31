package ChallengeLevel01;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("Enter the number to find factor: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Factor of number "+ n +" is: ");
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                System.out.print(i+"\t");
            }
        }
        sc.close();
    }
}
