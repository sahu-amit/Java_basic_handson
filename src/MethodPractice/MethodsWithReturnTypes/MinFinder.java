package MethodPractice.MethodsWithReturnTypes;

public class MinFinder {
    public static int findMin(int a, int b){
        return a>b?b:a;
    }

    public static void main(String[] args) {
        System.out.println("Smaller number is: "+findMin(94,26));
    }
}
