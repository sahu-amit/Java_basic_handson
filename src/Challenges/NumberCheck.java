package Challenges;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        if (A>0)
            System.out.println(A+" is a Positive Number");
        else if (A<0)
            System.out.println(A+" is a Negative Number");
        else
            System.out.println("The number is Zero");
    }
}
