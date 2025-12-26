public class WhileLoop {
    static void main() {
        int i = 1;


        while (i<=5){
            int j = 1;
            while (j <=4) {
                System.out.println("Everyone "+j);
                j++;
            }
            System.out.println("Hi "+i);
            ++i;
        };
        //Pre Increment
        System.out.println(++i);

        //Post Increment
        System.out.println(i++);
    }
}
