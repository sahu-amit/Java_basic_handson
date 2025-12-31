package ChallengeLevel01;

import java.util.Scanner;

public class NumbersAndItsEvenCount {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to "+n+" are: ");
        int count = 0;
        for (int i =1; i<=n; i++){
            System.out.print(i+"\t");
            if(i%2==0){
                count++;
            }
        }
        System.out.println( );
        System.out.println("Count of even numbers between 1 to "+n+" are: "+count);
        sc.close();
    }
}
