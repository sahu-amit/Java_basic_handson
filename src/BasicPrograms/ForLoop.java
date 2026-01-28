package BasicPrograms;

public class ForLoop {
    static void main() {
        for (int i=0; i<5;i++){
            System.out.println("Hi "+i);
            for (int j=1; j<=9; j++){
                System.out.println(" "+(j+8) +" - " +(j+9));
            }
        }
    }
}
