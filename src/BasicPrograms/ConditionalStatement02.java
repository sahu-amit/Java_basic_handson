package BasicPrograms;

public class ConditionalStatement02 {
        public static void main(String[] args) {

            int n = 4;

            switch (n) {
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tueseday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter value between 1 to 7");
                    break;
            }
        }
    }
