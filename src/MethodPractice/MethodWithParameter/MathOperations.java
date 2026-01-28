package MethodPractice.MethodWithParameter;

public class MathOperations {
    void square(int num){
        int sqr = num*num;
        System.out.println("Square is: "+sqr);
    }
    public void main(String[] args) {
        square(25);
    }
}