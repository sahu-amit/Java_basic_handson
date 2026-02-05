package MethodPractice.BasicMethodOverloading;

public class Concatenator {
    public static String concat(String a, String b){
        return a+b;
    }
    public static String concat(String a, String b, String c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(concat("Oye Raju ", "pyar naa kariyo kariyo"));
        System.out.println(concat("Oye Raju ", "pyar naa kariyo kariyo ", "dil toot jata hai"));
    }
}
