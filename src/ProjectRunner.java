public class ProjectRunner {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      STARTING UNIFIED JAVA PROJECT       ");
        System.out.println("==========================================\n");

        // 1. Running Main.java
        System.out.println("--- [1] Running Main ---");
        Main.main(args);
        System.out.println("\n");

        // 2. Running Hello.java
        System.out.println("--- [2] Running Hello ---");
        // Note: Hello has a static void main() with no args
        Hello.main(); 
        System.out.println("\n");

        // 3. Running Literals.java
        System.out.println("--- [3] Running Literals ---");
        Literals.main();
        System.out.println("\n");

        // 4. Running ConditionalStatement01.java
        System.out.println("--- [4] Running ConditionalStatement01 ---");
        ConditionalStatement01.main(args);
        System.out.println("\n");

        // 5. Running ConditionalStatement02.java
        System.out.println("--- [5] Running ConditionalStatement02 ---");
        ConditionalStatement02.main(args);
        System.out.println("\n");

        // 6. Running Loops.java
        System.out.println("--- [6] Running Loops ---");
        Loops.main(args);
        System.out.println("\n");

        // 7. Running ForLoop.java
        System.out.println("--- [7] Running ForLoop (Nested) ---");
        ForLoop.main();
        System.out.println("\n");

        // 8. Running DoWhileLoop.java
        System.out.println("--- [8] Running DoWhileLoop ---");
        DoWhileLoop.main();
        System.out.println("\n");

        // 9. Running EvenNumber.java
        System.out.println("--- [9] Running EvenNumber ---");
        EvenNumber.main(args);
        System.out.println("\n");

        // 10. Running Calculator.java
        System.out.println("--- [10] Running Calculator ---");
        Calculator.main(args);
        System.out.println("\n");

        System.out.println("==========================================");
        System.out.println("      ALL MODULES EXECUTED SUCCESSFULLY   ");
        System.out.println("==========================================");
    }
}