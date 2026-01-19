package BasicPrograms;

public class EvenNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i<=100; i++) {
            if (i%2==0) {
                System.out.print(i+ "\t ");
// Printing even numbers row wise in groups of 10
                count++;
                if (count%10==0){
                    System.out.println( );
                }
            }
        }
    }
}
