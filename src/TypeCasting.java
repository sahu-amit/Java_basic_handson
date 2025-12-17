public class TypeCasting {
    static void main() {
        byte a = 10;
        int b = 20;
        byte x = 10;
        int y = 20;


        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("This is Narrowing type casting where we convert value from Large data type to Small data type");
        b = a; //This is Narrowing type casting where we convert value from Large data type to Small data type
        System.out.println("b = a");
        System.out.println(b);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println("This is Widening type casting where we convert value from Small data type to Large data type");
        x = (byte)y; //This is Widening type casting where we convert value from Small data type to Large data type
        System.out.println("x = (byte)y");
        System.out.println(x);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        byte m = 10;
        byte n = 40;

        System.out.println("This is called type promotion here byte is promoting to int");
        System.out.println("int result = m*n");
        int result = m*n; // This is called type promotion here byte is promoting to int
        System.out.println(result);
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
