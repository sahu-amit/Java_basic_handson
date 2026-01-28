package BasicPrograms;

public class ProjectRunner {
    static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      STARTING UNIFIED JAVA PROJECT       ");
        System.out.println("==========================================\n");

        // 1. Running BasicPrograms.Main.java
        System.out.println("--- [1] Running BasicPrograms.Main ---");
        Main.main(args);
        System.out.println("\n");

        // 2. Running BasicPrograms.Hello.java
        System.out.println("--- [2] Running BasicPrograms.Hello ---");
        // Note: BasicPrograms.Hello has a static void main() with no args
        Hello.main(); 
        System.out.println("\n");

        // 3. Running BasicPrograms.Literals.java
        System.out.println("--- [3] Running BasicPrograms.Literals ---");
        Literals.main();
        System.out.println("\n");

        // 4. Running BasicPrograms.ConditionalStatement01.java
        System.out.println("--- [4] Running BasicPrograms.ConditionalStatement01 ---");
        ConditionalStatement01.main(args);
        System.out.println("\n");

        // 5. Running BasicPrograms.ConditionalStatement02.java
        System.out.println("--- [5] Running BasicPrograms.ConditionalStatement02 ---");
        ConditionalStatement02.main(args);
        System.out.println("\n");

        // 6. Running BasicPrograms.Loops.java
        System.out.println("--- [6] Running BasicPrograms.Loops ---");
        Loops.main(args);
        System.out.println("\n");

        // 7. Running BasicPrograms.ForLoop.java
        System.out.println("--- [7] Running BasicPrograms.ForLoop (Nested) ---");
        ForLoop.main();
        System.out.println("\n");

        // 8. Running BasicPrograms.DoWhileLoop.java
        System.out.println("--- [8] Running BasicPrograms.DoWhileLoop ---");
        DoWhileLoop.main();
        System.out.println("\n");

        // 9. Running BasicPrograms.EvenNumber.java
        System.out.println("--- [9] Running BasicPrograms.EvenNumber ---");
        EvenNumber.main(args);
        System.out.println("\n");

        // 10. Running BasicPrograms.Calculator.java
        System.out.println("--- [10] Running BasicPrograms.Calculator ---");
        Calculator.main(args);
        System.out.println("\n");

        System.out.println("==========================================");
        System.out.println("      ALL MODULES EXECUTED SUCCESSFULLY   ");
        System.out.println("==========================================");
    }
}