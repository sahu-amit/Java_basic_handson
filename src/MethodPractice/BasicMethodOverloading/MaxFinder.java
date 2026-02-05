package MethodPractice.BasicMethodOverloading;

public class MaxFinder {
    public static int findMax(int a, int b){
        return a>b?a:b;
    }
    public static int findMax(int a, int b, int c){
        int maxAB = a>b?a:b;
        return maxAB>c?maxAB:c;
    }
    public static void main(String[] args) {
        System.out.println(findMax(58, 69));
        System.out.println(findMax(400,392,365));
    }
}
