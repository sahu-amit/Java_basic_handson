public class Operators {
        public static void main(String[] args){

            // write code here
            int a = 20;
            int b = 10;

            int Add = a+b;
            System.out.println("Addition: "+Add);
            int subtract = a-b;
            System.out.println("Subtraction: "+subtract);
            int multiply = a*b;
            System.out.println("Multiplication: "+multiply);
            int divide  = a/b;
            System.out.println("Division: "+divide);

            boolean result = a>b;
            System.out.println("Is a greater than b? "+result);
            result = a>b && b>0;
            System.out.println("Is a > b and b > 0? "+result);

        }
    }
