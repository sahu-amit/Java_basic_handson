package BasicPrograms;

public class NumbersUsingLoop {
    static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            for (int j = i; j<=100; j+= 10) {
                System.out.print(j + "\t");
            }
        System.out.println( );
        }
    }
}