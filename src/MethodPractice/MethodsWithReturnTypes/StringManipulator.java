package MethodPractice.MethodsWithReturnTypes;

public class StringManipulator {
    static String getUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Uppercase of \"Amit\" is: "+getUpperCase("Amit"));
    }
}
