package BasicPrograms;

public class Operators {
        static void main(String[] args){

            // write code here
            int a = 20;
            int b = 10;
//Arithmatic operators
            int Add = a+b;
            System.out.println("Addition: "+Add);
            int subtract = a-b;
            System.out.println("Subtraction: "+subtract);
            int multiply = a*b;
            System.out.println("Multiplication: "+multiply);
            int divide  = a/b;
            System.out.println("Division: "+divide);
//Relational BasicPrograms.Operators or Comparators
            boolean result = a>b;
            System.out.println("Is a greater than b? "+result);

//Logical BasicPrograms.Operators
            result = a>b && b>0;
            System.out.println("Is a > b and b > 0? "+result);

        }
    }
