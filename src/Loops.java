public class Loops {
    public static void main(String[] args) {

        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for (int i = 1 ;i<=5 ;i++ ){
            System.out.print(i+" ");
        }

        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        int j = 1;
        while(j<= 5){
            System.out.print(j+" ");
            j++;
        }

        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop: ");
        int k=1;

        do{

            System.out.print(k+" ");
            k++;
        } while(k<=5);
    }
}
