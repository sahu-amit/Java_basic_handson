package Challenges;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i =1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of 1 to "+n+" numbers is: "+sum);
        sc.close();

//        Formula version
        System.out.println("--**--**--**--**--**--**--**--**--");
        sum = n*(n+1)/2;
        System.out.println("Sum of 1 to "+n+" numbers is: "+sum);

    }
}
