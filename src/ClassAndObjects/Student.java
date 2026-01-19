package ClassAndObjects;

public class Student {
    String rollNo;
    String name;
    int marks;
}

class St{
    public static void main(String[] args) {
        Student std = new Student();
        std.rollNo = "01HW244647";
        std.name = "Shalu";
        std.marks = 89;

        Student std1 = new Student();
        std1.rollNo = "01HW244648";
        std1.name = "Shefali";
        std1.marks = 85;

        Student std2 = new Student();
        std2.rollNo = "01HW244649";
        std2.name = "Sanjeev";
        std2.marks = 96;

        System.out.println("Roll Number of student: "+std.rollNo);
        System.out.println("Name of student: "+std.name);
        System.out.println("Marks of student out of 100: "+std.marks);
        System.out.println();

        System.out.println("Roll Number of student: "+std1.rollNo);
        System.out.println("Name of student: "+std1.name);
        System.out.println("Marks of student out of 100: "+std1.marks);
        System.out.println();

        System.out.println("Roll Number of student: "+std2.rollNo);
        System.out.println("Name of student: "+std2.name);
        System.out.println("Marks of student out of 100: "+std2.marks);
    }
}
