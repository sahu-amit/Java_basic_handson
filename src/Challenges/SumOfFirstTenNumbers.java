package Challenges;

public class SumOfFirstTenNumbers {
    public static void main(String[] args) {
        int number = 10;
        int sum = number*(number+1)/2;
        System.out.println("Sum of first 10 number is: "+sum);
        System.out.println("-------------*************-------------");

//      Sum Using loop
        sum = 0;
        for (int i =1; i<=10; i++){
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: "+sum);
    }
}
