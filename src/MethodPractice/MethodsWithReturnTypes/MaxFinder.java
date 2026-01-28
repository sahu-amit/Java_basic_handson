package MethodPractice.MethodsWithReturnTypes;

public class MaxFinder {
    public static int findMax(int a, int b){
        if (a>b){
            return a;
        }
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("Larger number is: "+findMax(30,29));
    }
}
