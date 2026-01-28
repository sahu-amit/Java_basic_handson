package MethodPractice.MethodsWithReturnTypes;

public class Student {
    public static char getGrade(int marks){
        if (marks >= 90 && marks <= 100){
            return 'A';
        }
        else if (marks >= 80){
            return 'B';
        }
        else if (marks >= 70){
            return 'C';
        }
        else if (marks >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(95));
    }
}
