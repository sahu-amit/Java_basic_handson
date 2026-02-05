package MethodPractice.BasicMethodOverloading;

public class Converter {
    public static double convert(int a){
        return a;
    }
    public static int convert(double c){
        return (int) c;
    }

    public static void main(String[] args) {
        System.out.println("int to double conversion: "+convert(126));
        System.out.println("double to int conversion: "+convert(1563.012));
    }
}
