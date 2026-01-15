package ChallengeLevel01;

public class GreaterNumber {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        int max = (a + b + Math.abs(a - b)) / 2;

        System.out.println("Greater Number is: "+ max);
//        System.out.println("b is greater than a: "+ (b>a));
    }
}
