public class Calculator {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        // TODO: Run the loop while 'again' equals 'y'
        while (again.equalsIgnoreCase("y")) {
            if (operator == '+') {
                double result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator == '-') {
                double result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator == '*') {
                double result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator.");
            }
            again = "n";

        }
        System.out.println("Thank you for using the calculator.");
    }
}
