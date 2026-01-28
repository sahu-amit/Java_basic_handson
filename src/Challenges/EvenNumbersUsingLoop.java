package Challenges;

public class EvenNumbersUsingLoop {
    static void main(String[] args) {
        int i =1;
        while (i<=20){
            if (i%2 == 0){
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
