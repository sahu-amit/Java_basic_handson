public class ConditionalStatement01 {
        public static void main(String[] args) {

            int score = 75;
            char grade = 'B';

            // TODO: Check pass or fail
            if (score >= 50)
                System.out.println("Passed");
            else
                System.out.println("Failed");

            // TODO: Determine grade based on score
            if (score >= 90)
                System.out.println("Grade: A");
            else if (score >=75 && score <=89)
                System.out.println("Grade: B");
            else if (score >=60 && score <=74)
                System.out.println("Grade: C");
            else
                System.out.println("Grade: D");
        }
    }
